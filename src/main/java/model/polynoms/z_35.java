package model.polynoms;

import model.Polynome;

public class z_35 implements Polynome {
    public z_35() {
    }

    public double getValue(double x, double y) {
        return 4 * Math.pow(x, 3) - 12 * x * Math.pow(y, 2) - 5 * Math.pow(x, 5) +
                10 * Math.pow(x, 3) * Math.pow(y, 2) + 15 * x * Math.pow(y, 4);
    }
}
