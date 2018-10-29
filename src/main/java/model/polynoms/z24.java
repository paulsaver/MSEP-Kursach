package model.polynoms;

import model.Polynome;

public class z24 implements Polynome {
    public z24() {
    }

    public double getValue(double x, double y) {
        return -1 + 12 * Math.pow(x, 2) + 12 * Math.pow(y, 2) - 30 * Math.pow(x, 4) - 60 * Math.pow(x, 2) * Math.pow(y, 2) -
                30 * Math.pow(y, 4) + 20 * Math.pow(x, 6) + 60 * Math.pow(x, 4) * Math.pow(y, 2) + 60 * Math.pow(x, 2) * Math.pow(y, 4) + 20 * Math.pow(y, 6);
    }
}
