package model.polynoms;

import model.Polynome;

public class z55 implements Polynome {
    public z55() {
    }

    public double getValue(double x, double y) {
        return Math.pow(y, 5) - 10 * Math.pow(x, 2) * Math.pow(y, 3) + 5 * y * Math.pow(x, 4);
    }
}
