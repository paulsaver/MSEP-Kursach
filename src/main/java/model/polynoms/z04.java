package model.polynoms;

import model.Polynome;

public class z04 implements Polynome {
    public z04() {
    }

    public double getValue(double x, double y) {
        return 1 - 6 * Math.pow(x, 2) - 6 * Math.pow(y, 2) + 6 * Math.pow(x, 4) +
                12 * Math.pow(x, 2) * Math.pow(y, 2) + 6 * Math.pow(y, 4);
    }
}
