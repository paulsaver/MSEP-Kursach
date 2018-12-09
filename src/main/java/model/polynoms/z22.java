package model.polynoms;

import model.Polynome;

public class z22 implements Polynome {
    public z22() {
    }

    public double getValue(double x, double y) {
        return (-Math.pow(x, 2) + Math.pow(y, 2));
    }
}
