package model.polynoms;

import model.Polynome;

public class z44 implements Polynome {
    public z44() {
    }

    public double getValue(double x, double y) {
        return Math.pow(x, 4) - 6 * Math.pow(x, 2) * Math.pow(y, 2) + Math.pow(y, 4);
    }
}
