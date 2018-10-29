package model.polynoms;

import model.Polynome;

public class z3 implements Polynome {
    public z3() {
    }

    public double getValue(double x, double y) {
        return 2 * x * y;
    }
}
