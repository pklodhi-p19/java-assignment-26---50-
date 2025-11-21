import java.util.Scanner;

public class WeightofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase();

        int weight = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                weight += (ch - 'a' + 1);
            }
        }

        System.out.println("Weight of string = " + weight);
    }
}

