package main.design.BuilderModel;

public class BegBugger extends Burger{
    @Override
    public String name() {
        return "VegBugger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
