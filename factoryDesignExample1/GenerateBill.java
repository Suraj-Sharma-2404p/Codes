package factoryDesignExample1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        System.out.println("Enter the name of plan for which the bill will be generated:");
        Scanner scn = new Scanner(System.in);
        String planName = scn.next();
        System.out.println("Enter the number of units for which the bill will be calculated: ");
        int units = scn.nextInt();

        Plan plan = getPlanFactory.getPlan(planName);
        System.out.println("Bill amount for "+ planName+ " of " + units+ " units is :");
        plan.getRate();
        plan.calculateBill(units);

    }
}
