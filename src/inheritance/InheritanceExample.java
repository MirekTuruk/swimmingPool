package inheritance;

import example.EColor;

public class InheritanceExample {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,5, EColor.RED);
        System.out.println(rectangle);
        System.out.println("perimeter= " + rectangle.getPerimeter());
        System.out.println("surface+ " + rectangle.getSurface());
        System.out.println("===================================================================================");

        Sqare sqare = new Sqare(6, EColor.YELLOW);
        System.out.println(sqare);
        System.out.println("perimeter= " + sqare.getPerimeter());
        System.out.println("surface+ " + sqare.getSurface());
        System.out.println("===================================================================================");

        Triangle triangle = new Triangle(3, 4, 5, EColor.ORANGE);
        System.out.println(triangle);
        System.out.println("perimeter= " + triangle.getPerimeter());
        System.out.println("surface+ " + triangle.getSurface());
        System.out.println("===================================================================================");

        Circle circle = new Circle(3, EColor.BLUE);
        System.out.println(circle);
        System.out.println("perimeter= " + circle.getPerimeter());
        System.out.println("surface+ " + circle.getSurface());
        System.out.println("===================================================================================");
    }
}
