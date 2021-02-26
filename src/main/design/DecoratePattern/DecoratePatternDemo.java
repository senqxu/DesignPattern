package main.design.DecoratePattern;

public class DecoratePatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with normal border");
        redCircle.draw();

        System.out.println("Circle with normal border");
        redRectangle.draw();

    }
}
