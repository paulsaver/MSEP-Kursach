package model;

import org.apache.commons.math3.complex.Complex;
import org.jzy3d.maths.Coord3d;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class FresnelTransform {

    private Polynome polynome;

    public FresnelTransform(Polynome polynome) {
        this.polynome = polynome;
    }

    public List<Coord3d> transform(double k, double z, int steps) {
        Complex[][] output = new Complex[steps][steps];
        List<Coord3d> coord3ds = new ArrayList<Coord3d>();

        double minX = -1;
        double minY = -1;

        double h = 2./steps;

        for (int i = 0; i < steps; i++) {
            for (int j = 0; j < steps; j++) {
                output[i][j] = new Complex(0,0);
                for (int m = 0; m < steps; m++) {
                    for (int n = 0; n < steps; n++) {
                        Complex adding = new Complex(0,1);
                        output[i][j] = output[i][j].add(
                                adding.multiply(k)
                                .divide(2*Math.PI*z)
                                .multiply((pow(m-i,2)+pow(n-j,2)/pow(h,2))).exp()
                                .multiply(polynome.getValue(minX + m*h, minY + n*h))
                        );
                    }
                }
                Complex adding = new Complex(0,1);

                output[i][j] = output[i][j].multiply(adding.multiply(k)
                        .divide(2*Math.PI*z)).multiply(pow(h,2));

                coord3ds.add(new Coord3d(minX + i*h,minY + j*h, output[i][j].abs()));
            }
        }
        return coord3ds;
    }
}
