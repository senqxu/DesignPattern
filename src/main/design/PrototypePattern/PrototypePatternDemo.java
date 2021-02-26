package main.design.PrototypePattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("shape:"+ clonedShape.getType());

        Shape clonedShape1 = ShapeCache.getShape("2");
        System.out.println("shape:"+ clonedShape1.getType());
    }
}

