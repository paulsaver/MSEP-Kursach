package model.polynoms;

import model.Polynome;

public class z15 implements Polynome {
    public z15() {
    }

    public double getValue(double x, double y) {
        return 3 * y - 12 * Math.pow(y, 3) - 12 * y * Math.pow(x, 2) + 10 * Math.pow(y, 5) +
                20 * Math.pow(y, 3) * Math.pow(x, 2) + 10 * y * Math.pow(x, 4);
    }
}
