package StructuralDesignPattern.Decorator_Pattern;

import StructuralDesignPattern.Decorator_Pattern.baseImpl.Espresso;
import StructuralDesignPattern.Decorator_Pattern.baseInterface.Coffee;
import StructuralDesignPattern.Decorator_Pattern.dec_inter_impl.MilkDecorator;
import StructuralDesignPattern.Decorator_Pattern.dec_inter_impl.SugarDecorator;

public class Implementation {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        //coffee = new SugarDecorator(coffee);
        //coffee = new MilkDecorator(coffee);
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $"+ coffee.getCost());
    }
}
