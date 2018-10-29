package model.polynoms;

import model.Polynome;

public class z25 implements Polynome {
    public z25() {
    }

    public double getValue(double x, double y) {
        return -6 * Math.pow(x, 2) + 6 * Math.pow(y, 2) + 20 * Math.pow(x, 4) - 20 * Math.pow(y, 4) - 15 * Math.pow(x, 6) -
                15 * Math.pow(x, 4) * Math.pow(y, 2) + 15 * Math.pow(x, 2) * Math.pow(y, 4) + 15 * Math.pow(y, 6);
    }
}
