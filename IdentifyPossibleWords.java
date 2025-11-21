import java.util.*;

public class IdentifyPossibleWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter characters: ");
        String chars = sc.next().toLowerCase();

        String[] dict = {"cat", "dog", "god", "act", "taco"};

        int[] freq = new int[26];
        for (char c : chars.toCharArray())
            freq[c - 'a']++;

        for (String w : dict) {
            int[] f = freq.clone();
            boolean possible = true;

            for (char c : w.toCharArray()) {
                if (f[c - 'a'] == 0) {
                    possible = false;
                    break;
                }
                f[c - 'a']--;
            }

            if (possible) System.out.println(w);
        }
    }
}
