package model.polynoms;

import model.Polynome;

public class z17 implements Polynome {
    public z17() {
    }

    public double getValue(double x, double y) {
        return 3 * x - 12 * Math.pow(x, 3) - 12 * x * Math.pow(y, 2) + 10 * Math.pow(x, 5) +
                20 * Math.pow(x, 3) * Math.pow(y, 2) + 10 * x * Math.pow(y, 4);
    }
}
