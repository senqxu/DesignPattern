package main.design.BuilderModel;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke Cold drinks";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
