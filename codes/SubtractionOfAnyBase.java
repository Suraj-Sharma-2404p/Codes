package codes;

import java.util.Scanner;

public class SubtractionOfAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the base :");
        int base = scanner.nextInt();
        System.out.println("enter first number :");
        int number1 = scanner.nextInt();
        System.out.println("enter second number:");
        int number2 = scanner.nextInt();
        int ans = getDifference(base,number1,number2);
        System.out.println(ans);
    }
    public static  int getDifference(int base , int number1, int number2){
        int carry =0;
        int ans = 0;
        int p = 1;
        while(number2 > 0){
            int digit1 = number1 % 10;
            int digit2 = number2 % 10;
            number1 = number1 / 10;
            number2 = number2 / 10;
            int difference = digit2 - digit1 + carry;
            if(difference < 0){
                carry = -1;
                difference = difference + base;
            }else{
                carry = 0;
            }
            ans += difference * p;
            p = p* 10;
        }
        return ans;
    }
}
