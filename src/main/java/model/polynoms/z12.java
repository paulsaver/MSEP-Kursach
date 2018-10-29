package model.polynoms;

import model.Polynome;

public class z12 implements Polynome {
    public z12() {
    }

    public double getValue(double x, double y) {
        return 1 - 6 * Math.pow(x, 2) - 6 * Math.pow(y, 2) + 6 * Math.pow(x, 4) +
                12 * Math.pow(x, 2) * Math.pow(y, 2) + 6 * Math.pow(y, 4);
    }
}
