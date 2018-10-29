package model.polynoms;

import model.Polynome;

public class z8 implements Polynome {
    public z8() {
    }

    public double getValue(double x, double y) {
        return -2 * y + 3 * Math.pow(y, 3) + 3 * y * Math.pow(x, 2);
    }
}
