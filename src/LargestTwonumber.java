import java.util.Scanner;
public class LargestTwonumber {
    public static void main(String args[])
    {
        int num1, num2, num3;
        System.out.println("Enter three integers: ");
        Scanner in = new Scanner(System.in);
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.println("The largest number is: "+num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("The largest number is: "+num2);
        else if (num3 > num1 && num3 > num2)
            System.out.println("The largest number is: "+num3);
        else
            System.out.println("The numbers are same.");
    }
}
