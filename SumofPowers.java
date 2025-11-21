import java.util.Scanner;

public class SumOfPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter power k: ");
        int k = sc.nextInt();

        int sum = 0;
        int temp = n;

        while (temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, k);
            temp /= 10;
        }

        System.out.println("Sum = " + sum);
    }
}
