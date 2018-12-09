package model.polynoms;

import model.Polynome;

public class z_33 implements Polynome {
    public z_33() {
    }

    public double getValue(double x, double y) {
        return -Math.pow(x, 3) + 3 * x * Math.pow(y, 2);
    }
}
