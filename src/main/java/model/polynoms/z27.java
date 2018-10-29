package model.polynoms;

import model.Polynome;

public class z27 implements Polynome {
    public z27() {
    }

    public double getValue(double x, double y) {
        return -Math.pow(x, 6) + 15 * Math.pow(x, 4) * Math.pow(y, 2) -
                15 * Math.pow(x, 2) * Math.pow(y, 4) + Math.pow(y, 6);
    }
}
