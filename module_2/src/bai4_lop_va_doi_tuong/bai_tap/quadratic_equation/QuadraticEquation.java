package bai4_lop_va_doi_tuong.bai_tap.quadratic_equation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2*a;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * a;    }
}
