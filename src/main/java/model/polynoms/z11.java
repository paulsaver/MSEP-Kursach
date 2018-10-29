package model.polynoms;

import model.Polynome;

public class z11 implements Polynome {
    public z11() {
    }

    public double getValue(double x, double y) {
        return -6 * x * y + 8 * Math.pow(x, 3) * y + 8 * x * Math.pow(y, 3);
    }
}
