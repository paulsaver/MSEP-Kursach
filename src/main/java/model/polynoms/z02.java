package model.polynoms;

import model.Polynome;

public class z02 implements Polynome {
    public z02() {
    }

    public double getValue(double x, double y) {
        return (2 * (Math.pow(x, 2) + Math.pow(y, 2)) - 1);
    }
}
