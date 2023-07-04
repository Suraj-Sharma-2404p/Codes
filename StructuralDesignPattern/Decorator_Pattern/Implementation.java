package StructuralDesignPattern.Decorator_Pattern;

import StructuralDesignPattern.Decorator_Pattern.baseImpl.Cappuccino;
import StructuralDesignPattern.Decorator_Pattern.baseImpl.Espresso;
import StructuralDesignPattern.Decorator_Pattern.baseInterface.Coffee;
import StructuralDesignPattern.Decorator_Pattern.dec_inter_impl.MilkDecorator;
import StructuralDesignPattern.Decorator_Pattern.dec_inter_impl.SugarDecorator;

public class Implementation {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $"+ coffee.getCost());

        Coffee cappuccino = new Cappuccino();
        cappuccino = new MilkDecorator(cappuccino);
        cappuccino = new SugarDecorator(cappuccino);
        System.out.println("Description:"+cappuccino.getDescription());
        System.out.println("cost: $"+cappuccino.getCost());
    }
}
