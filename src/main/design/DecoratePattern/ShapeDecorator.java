package main.design.DecoratePattern;

public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    @Override
    public void draw() {
        decoratedShape.draw();
    }


    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
}
