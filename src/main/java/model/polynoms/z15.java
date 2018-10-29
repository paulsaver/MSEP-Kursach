package model.polynoms;

import model.Polynome;

public class z15 implements Polynome {
    public z15() {
    }

    public double getValue(double x, double y) {
        return Math.pow(x, 5) - 10 * Math.pow(x, 3) * Math.pow(y, 2) + 5 * x * Math.pow(y, 4);
    }
}
