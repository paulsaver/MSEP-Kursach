import model.FresnelTransform;
import model.Polynome;
import model.polynoms.*;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;
import org.jzy3d.chart.AWTChart;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.controllers.mouse.camera.AWTCameraMouseController;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;

import java.util.List;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        final Polynome polynome = new z00();

        final FastFourierTransformer fastFourierTransformer = new FastFourierTransformer(DftNormalization.STANDARD);

// Define a function to plot
        Mapper mapper = new Mapper() {
            public double f(double x, double y) {
                double a[] = new double[1];
                a[0] = polynome.getValue(x, y);
                Complex[] res = fastFourierTransformer.transform(a, TransformType.FORWARD);
                return res[0].abs();
            }
        };

        Mapper mapper1 = new Mapper() {

            @Override
            public double f(double x, double y) {
                return abs(polynome.getValue(x, y));
            }
        };


// Define range and precision for the function to plot
        Range rangex = new Range(-1, 1);
        Range rangey = new Range(-1, 1);
        int steps = 128;
        double lyambda = 0.1;
        double k = 2 * PI / lyambda;
        double z = 300;

        FresnelTransform fresnelTransform = new FresnelTransform(polynome);

        List<Coord3d> coord3ds = fresnelTransform.transform(k, z, steps);

        float min = coord3ds.get(0).z;
        float max = coord3ds.get(0).z;

        for (Coord3d coord3d : coord3ds) {
            max = Math.max(max, coord3d.z);
            min = Math.min(min, coord3d.z);
        }

        Range rangeNewx = new Range(min, max);

        Shape surface = Builder.buildDelaunay(coord3ds);
        surface.setColorMapper(new ColorMapper(new ColorMapRainbow(), rangeNewx));
        surface.setFaceDisplayed(true);
        surface.setWireframeDisplayed(false);
        surface.setWireframeColor(Color.BLACK);

        Chart chart = new AWTChart(Quality.Nicest);
        chart.add(surface);
        chart.addController(new AWTCameraMouseController());
        chart.open("Jzy3d Demo", 600, 600);

// Create a surface drawing that function
/*        Shape surface = Builder.buildOrthonormal(new RingGrid(1, steps), mapper1);
        surface.setColorMapper(new ColorMapper(new ColorMapRainbow(), rangex));
        surface.setFaceDisplayed(true);
        surface.setWireframeDisplayed(false);
        surface.setWireframeColor(Color.BLACK);

// Create a chart and add the surface
        Chart chart = new AWTChart(Quality.Nicest);
        chart.add(surface);
        chart.addController(new AWTCameraMouseController());
        chart.open("Jzy3d Demo", 600, 600);*/

        Shape surface1 = Builder.buildOrthonormal(new OrthonormalGrid(rangex, steps, rangey, steps), mapper1);
        surface1.setColorMapper(new ColorMapper(new ColorMapRainbow(), rangex));
        surface1.setFaceDisplayed(true);
        surface1.setWireframeDisplayed(false);
        surface1.setWireframeColor(Color.BLACK);

// Create a chart and add the surface
        Chart chart1 = new AWTChart(Quality.Nicest);
        chart1.add(surface1);
        chart1.addController(new AWTCameraMouseController());
        chart1.open("Jzy3d Demo", 600, 600);
    }
}
