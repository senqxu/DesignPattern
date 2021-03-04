package main.design.SingletonPattern;

public class SingletonObject {

    private static SingletonObject instance = new SingletonObject();

    //use private for constructor function,so that the class is not instantiated
    private SingletonObject(){}

    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Singleton instance");
    }
}
