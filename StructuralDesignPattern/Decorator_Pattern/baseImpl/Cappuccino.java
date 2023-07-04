package StructuralDesignPattern.Decorator_Pattern.baseImpl;

import StructuralDesignPattern.Decorator_Pattern.baseInterface.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public double getCost() {
        return 100.0;
    }

    @Override
    public String getDescription() {
        return "Special Cappuccino";
    }
}
