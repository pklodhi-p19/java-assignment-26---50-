import java.util.Scanner;

public class MostFrequentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String num = sc.next();

        int[] freq = new int[10];

        for (char ch : num.toCharArray()) {
            freq[ch - '0']++;
        }

        int maxFreq = -1, digit = -1;

        for (int i = 0; i <= 9; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                digit = i;
            }
        }

        System.out.println("Most frequent digit = " + digit);
    }
}
