import java.util.Scanner;

public class StringAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first large number: ");
        String a = sc.next();

        System.out.print("Enter second large number: ");
        String b = sc.next();

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int x = (i >= 0) ? a.charAt(i) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = x + y + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        System.out.println("Sum = " + result.reverse());
    }
}
