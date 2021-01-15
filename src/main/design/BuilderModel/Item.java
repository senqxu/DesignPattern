package main.design.BuilderModel;

/**
 *我们将创建一个表示食物条目（比如汉堡和冷饮）的 Item 接口和实现 Item 接口的实体类，以及一个表示食物包装的 Packing
 * 接口和实现 Packing 接口的实体类，汉堡是包在纸盒中，冷饮是装在瓶子中。
 *
 * 然后我们创建一个 Meal 类，带有 Item 的 ArrayList 和一个通过结合 Item 来创建不同类型的 Meal 对象的 MealBuilder。
 * BuilderPatternDemo 类使用 MealBuilder 来创建一个 Meal。
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
