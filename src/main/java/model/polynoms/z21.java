package model.polynoms;

import model.Polynome;

public class z21 implements Polynome {
    public z21() {
    }

    public double getValue(double x, double y) {
        return 6 * y * Math.pow(x, 5) - 20 * Math.pow(x, 3) * Math.pow(y, 3) + 6 * x * Math.pow(y, 5);
    }
}
