import java.util.Scanner;

public class GetCodeThroughString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        if (s.length() == 0) {
            System.out.println("Invalid string");
            return;
        }

        int first = s.charAt(0);
        int last = s.charAt(s.length() - 1);

        int code = Math.abs(first - last) + s.length();

        System.out.println("Generated Code = " + code);
    }
}
