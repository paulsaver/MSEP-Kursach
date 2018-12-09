package model.polynoms;

import model.Polynome;

public class z_46 implements Polynome {
    public z_46() {
    }

    public double getValue(double x, double y) {
        return 20 * Math.pow(x, 3) * y - 20 * x * Math.pow(y, 3) - 24 * Math.pow(x, 5) * y + 24 * x * Math.pow(y, 5);
    }
}
