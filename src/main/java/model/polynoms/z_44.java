package model.polynoms;

import model.Polynome;

public class z_44 implements Polynome {
    public z_44() {
    }

    public double getValue(double x, double y) {
        return -4 * Math.pow(x, 3) * y + 4 * x * Math.pow(y, 3);
    }
}
