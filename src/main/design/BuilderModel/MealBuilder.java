package main.design.BuilderModel;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new BegBugger());
        meal.addItem(new ChickenBugger());
        meal.addItem(new Coke());
        return meal;
    }

}
