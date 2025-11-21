import java.util.Scanner;

public class EncodeThreeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        String part1 = a.toUpperCase();
        String part2 = b.toLowerCase();
        String part3 = new StringBuilder(c).reverse().toString();

        String encoded = part1 + part2 + part3;

        System.out.println("Encoded String = " + encoded);
    }
}
