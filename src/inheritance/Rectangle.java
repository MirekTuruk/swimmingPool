package inheritance;

import example.AbstractShape;
import example.EColor;

public class Rectangle extends AbstractShape {

    double a, b;

    public Rectangle(double a, double b, EColor color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getSurface() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", color=" + color +
                '}';
    }
}
