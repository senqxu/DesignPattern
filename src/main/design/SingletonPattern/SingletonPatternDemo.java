package main.design.SingletonPattern;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingletonObject object = SingletonObject.getInstance();
        object.showMessage();
    }

}
