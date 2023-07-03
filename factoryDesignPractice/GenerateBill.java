package factoryDesignPractice;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the plan name:");
        String planType = scanner.next();
        System.out.println("Enter the number of units:");
        int units = scanner.nextInt();


        Plan plan = planFactory.getPlanObject(planType);

        plan.getRate();
        plan.generateBill(units);
    }
}
