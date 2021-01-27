package main.design.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        //获取形状为circle的对象
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        //获取颜色的工厂
        AbstractFactory colorFacotry = FactoryProducer.getFactory("Color");
        Color color1 = colorFacotry.getColor("Red");
        color1.fill();
    }
}
