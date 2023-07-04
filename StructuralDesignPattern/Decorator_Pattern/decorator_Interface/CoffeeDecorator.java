package StructuralDesignPattern.Decorator_Pattern.decorator_Interface;

import StructuralDesignPattern.Decorator_Pattern.baseInterface.Coffee;

public class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
