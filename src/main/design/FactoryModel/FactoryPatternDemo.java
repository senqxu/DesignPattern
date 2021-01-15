package main.design.FactoryModel;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapFactory shapFactory = new ShapFactory();
        Shape shape1 = shapFactory.getShape("Square");
        shape1.draw();

        Shape shape2 = shapFactory.getShape("Rectangle");
        shape2.draw();

    }
}
