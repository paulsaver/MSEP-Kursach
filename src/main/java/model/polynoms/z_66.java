package model.polynoms;

import model.Polynome;

public class z_66 implements Polynome {
    public z_66() {
    }

    public double getValue(double x, double y) {
        return 6 * y * Math.pow(x, 5) - 20 * Math.pow(x, 3) * Math.pow(y, 3) + 6 * x * Math.pow(y, 5);
    }
}
