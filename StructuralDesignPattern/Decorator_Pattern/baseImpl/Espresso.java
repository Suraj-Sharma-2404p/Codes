package StructuralDesignPattern.Decorator_Pattern.baseImpl;

import StructuralDesignPattern.Decorator_Pattern.baseInterface.Coffee;

public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
