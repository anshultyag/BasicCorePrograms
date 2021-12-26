import java.util.Scanner;

public class ComputeQuotientAndRemainder {
        public static void main(String[] args) {
            int num1 , num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Divisor:: ");
            num1 = sc.nextInt();
            Scanner cc = new Scanner(System.in);
            System.out.println("Enter a number Divdend:: ");
            num2 = cc.nextInt();

            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("Quotient is: " + quotient);
            System.out.println("Remainder is: " + remainder);
        }
}
