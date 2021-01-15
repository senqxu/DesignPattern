package main.design.FactoryModel;

public class ShapFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null)
            return null;
        if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
