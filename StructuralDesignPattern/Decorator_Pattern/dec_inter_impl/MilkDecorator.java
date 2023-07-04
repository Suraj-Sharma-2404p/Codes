package StructuralDesignPattern.Decorator_Pattern.dec_inter_impl;

import StructuralDesignPattern.Decorator_Pattern.baseInterface.Coffee;
import StructuralDesignPattern.Decorator_Pattern.decorator_Interface.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " with MILK ";
    }
}
