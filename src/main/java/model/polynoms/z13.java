package model.polynoms;

import model.Polynome;

public class z13 implements Polynome {
    public z13() {
    }

    public double getValue(double x, double y) {
        return -2 * y + 3 * Math.pow(y, 3) + 3 * y * Math.pow(x, 2);
    }
}
