package inheritance;

import example.EColor;

public class Sqare extends Rectangle {


    public Sqare( double a, EColor color) {
        super( a, a, color);
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
