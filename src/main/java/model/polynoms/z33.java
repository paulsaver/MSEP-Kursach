package model.polynoms;

import model.Polynome;

public class z33 implements Polynome {
    public z33() {
    }

    public double getValue(double x, double y) {
        return Math.pow(y, 3) - 3 * Math.pow(x, 2) * y;
    }
}
