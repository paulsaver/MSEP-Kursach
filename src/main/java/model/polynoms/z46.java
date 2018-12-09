package model.polynoms;

import model.Polynome;

public class z46 implements Polynome {
    public z46() {
    }

    public double getValue(double x, double y) {
        return -5 * Math.pow(x, 4) + 30 * Math.pow(x, 2) * Math.pow(y, 2) - 5 * Math.pow(y, 4) +
                6 * Math.pow(x, 6) - 30 * Math.pow(x, 4) * Math.pow(y, 2) - 30 * Math.pow(x, 2) * Math.pow(y, 4) + 6 * Math.pow(y, 6);
    }
}
