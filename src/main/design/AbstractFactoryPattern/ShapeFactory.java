package main.design.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {

            return new Square();
        }
        return null;
    }
}
