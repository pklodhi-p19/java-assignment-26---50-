import java.util.Scanner;

public class FindStringCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int sum = 0;

        for (char ch : s.toCharArray()) {
            sum += (int) ch;
        }

        System.out.println("String Code = " + sum);
    }
}

