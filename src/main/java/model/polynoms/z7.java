package model.polynoms;

import model.Polynome;

public class z7 implements Polynome {
    public z7() {
    }

    public double getValue(double x, double y) {
        return -2 * x + 3 * Math.pow(x, 3) + 3 * x * Math.pow(y, 2);
    }
}
