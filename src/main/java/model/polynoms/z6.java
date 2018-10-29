package model.polynoms;

import model.Polynome;

public class z6 implements Polynome {
    public z6() {
    }

    public double getValue(double x, double y) {
        return -Math.pow(x, 3) + 3 * x * Math.pow(y, 2);
    }
}
