package model.polynoms;

import model.Polynome;

public class z35 implements Polynome {
    public z35() {
    }

    public double getValue(double x, double y) {
        return -4 * Math.pow(y, 3) + 12 * y * Math.pow(x, 2) + 5 * Math.pow(y, 5) -
                10 * Math.pow(y, 3) * Math.pow(x, 2) - 15 * y * Math.pow(x, 4);
    }
}
