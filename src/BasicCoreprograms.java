import java.util.Scanner;
public class BasicCoreprograms {
    public static void main(String[] args) {
        // INITIALIZATION

        int n, h_cnt = 0, t_cnt = 0;
        double heads, tails;
        // Input
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc.nextInt();

        // COMPUTATION
        for (int i = 0; i < a; i++) {
            double random = Math.random();
            if (random < 0.5)
                t_cnt++;
            else
                h_cnt++;
        }

        heads = h_cnt / (double) a * 100;
        tails = t_cnt / (double) a * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");

    }
}
