package model.polynoms;

import model.Polynome;

public class z13 implements Polynome {
    public z13() {
    }

    public double getValue(double x, double y) {
        return 3 * Math.pow(x, 2) - 3 * Math.pow(y, 2) - 4 * Math.pow(x, 4) + 4 * Math.pow(y, 4);
    }
}
