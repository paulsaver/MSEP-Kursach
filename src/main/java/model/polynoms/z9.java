package model.polynoms;

import model.Polynome;

public class z9 implements Polynome {
    public z9() {
    }

    public double getValue(double x, double y) {
        return Math.pow(y, 3) - 3 * Math.pow(x, 2) * y;
    }
}
