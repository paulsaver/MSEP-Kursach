package model.polynoms;

import model.Polynome;

public class z5 implements Polynome {
    public z5() {
    }

    public double getValue(double x, double y) {
        return (-Math.pow(x, 2) + Math.pow(y, 2));
    }
}
