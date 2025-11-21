import java.util.Scanner;

public class MostFrequentDigitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int[] freq = new int[10];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int x = arr[i];
            while (x != 0) {
                freq[x % 10]++;
                x /= 10;
            }
        }

        int maxDigit = 0, maxFreq = -1;

        for (int i = 0; i <= 9; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxDigit = i;
            }
        }

        System.out.println("Most Frequent Digit = " + maxDigit);
    }
}
