package model.polynoms;

import model.Polynome;

public class z_24 implements Polynome {
    public z_24() {
    }

    public double getValue(double x, double y) {
        return -6 * x * y + 8 * Math.pow(x, 3) * y + 8 * x * Math.pow(y, 3);
    }
}
