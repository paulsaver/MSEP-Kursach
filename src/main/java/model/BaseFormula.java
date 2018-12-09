package model;


import static java.lang.Math.cos;
import static java.lang.Math.pow;

public class BaseFormula {
    private int n;
    private int m;

    public BaseFormula(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public double getValue(double p, double phi){
        int i = (n - m)/2;
        double result = 0;
        for (int j = 0; j < i; j++){
            result = (pow(-1,j)*calculateFactorial(n-j)*pow(p,n-2*j))/(calculateFactorial(j)*
                    calculateFactorial((n+m)/2 - j)*
                    calculateFactorial((n-m)/2 - j));
        }
        return result*cos(m*phi);
    }

    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
}
