package inheritance;

import example.AbstractShape;

public class Sqare extends Rectangle {


    public Sqare(EColor color, double a, double b) {
        super(color, a, b);
    }

    @Override
    public void setA(double a) {
        setSide(a);
    }

    @Override
    public void setB(double b) {
        setSide(b);
    }

    private void setSide(double side) {
        super.setA(side);
        super.setB(side);
    }

    @Override
    public String toString() {
        return "Square: a=" + a + " , color=" + color;
    }
}
