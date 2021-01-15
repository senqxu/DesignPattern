package main.design.BuilderModel;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        System.out.println("Total cost:" + vegMeal.getCost());
        vegMeal.showItems();
    }

}
