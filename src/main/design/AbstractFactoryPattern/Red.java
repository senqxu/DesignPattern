package main.design.AbstractFactoryPattern;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside REd: fill() method");
    }
}
