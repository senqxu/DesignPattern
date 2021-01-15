package main.design.BuilderModel;

public class ChickenBugger extends Burger{
    /**
     * 生成chickenBugger
     * @return
     */
    @Override
    public String name() {
        return "ChickenBugger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
