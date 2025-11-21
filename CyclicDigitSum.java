import java.util.Scanner;

public class CyclicDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();
        int total = 0;

        String temp = s;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (char ch : temp.toCharArray())
                sum += ch - '0';

            total += sum;

            // rotate string
            temp = temp.substring(1) + temp.charAt(0);
        }

        System.out.println("Total = " + total);
    }
}
