package StructuralDesignPattern.Decorator_Pattern.dec_inter_impl;

import StructuralDesignPattern.Decorator_Pattern.baseInterface.Coffee;
import StructuralDesignPattern.Decorator_Pattern.decorator_Interface.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost()+2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " and Sugar";
    }
}
