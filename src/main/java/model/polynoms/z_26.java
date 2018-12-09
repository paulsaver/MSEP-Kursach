package model.polynoms;

import model.Polynome;

public class z_26 implements Polynome {
    public z_26() {
    }

    public double getValue(double x, double y) {
        return 12 * x * y - 40 * Math.pow(x, 3) * y - 40 * x * Math.pow(y, 3) + 30 * Math.pow(x, 5) * y +
                60 * Math.pow(x, 3) * Math.pow(y, 3) - 30 * x * Math.pow(y, 5);
    }
}
