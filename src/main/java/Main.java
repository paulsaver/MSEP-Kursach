import model.Polynome;
import model.polynoms.*;
import org.jzy3d.chart.AWTChart;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.controllers.mouse.camera.AWTCameraMouseController;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.RingGrid;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;

public class Main {

    public static void main(String[] args) {

        final Polynome polynome = new z12();

// Define a function to plot
        Mapper mapper = new Mapper() {
            public double f(double x, double y) {
                return polynome.getValue(x,y);
            }
        };

// Define range and precision for the function to plot
        Range rangex = new Range(-1, 1);
        Range rangey = new Range(0, (float) (2 * Math.PI));
        int steps = 200;

// Create a surface drawing that function
        Shape surface = Builder.buildOrthonormal(new RingGrid(1, steps), mapper);
        surface.setColorMapper(new ColorMapper(new ColorMapRainbow(), rangex));
        surface.setFaceDisplayed(true);
        surface.setWireframeDisplayed(false);
        surface.setWireframeColor(Color.BLACK);

// Create a chart and add the surface
        Chart chart = new AWTChart(Quality.Nicest);
        chart.add(surface);
        chart.addController(new AWTCameraMouseController());
        chart.open("Jzy3d Demo", 600, 600);
    }
}
