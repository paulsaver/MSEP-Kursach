package model.polynoms;

import model.Polynome;

public class z4 implements Polynome {
    public z4() {
    }

    public double getValue(double x, double y) {
        return (2 * (Math.pow(x, 2) + Math.pow(y, 2)) - 1);
    }
}
