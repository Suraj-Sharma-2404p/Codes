import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)   ;
        int base = scanner.nextInt();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int ans = sum(base,number1,number2);
        System.out.println(ans);
    }

    private static int sum(int base, int number1, int number2) {
        int carry =0;
        int p =1;
        int ans =0;
        while(carry >0 || number2>0 || number1>0){
            int digit1 = number1%10;
            int digit2 = number2%10;
             number1 = number1/10;
             number2 = number2 /10;
             int sum = digit2+digit1+carry;
             carry = sum/base;
             sum = sum%base;
             ans += sum*p;
             p*= 10;
        }
        return ans;
    }
}
