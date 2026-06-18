import java.util.*;

public class Main {

    public static int longestContSequence(int[] a) {
        if (a.length == 0 || a.length == 1) {
            return a.length;
        }

        Arrays.sort(a);

        int currCount = 1;
        int longestCount = 1;

        for (int i = 1; i < a.length; i++) {

            if (a[i] == a[i - 1]) {
                continue; // skip duplicates
            }

            else if (a[i] == a[i - 1] + 1) {
                currCount++;
                longestCount = Math.max(longestCount, currCount);
            }

            else {
                currCount = 1; // start a new sequence
            }
        }

        return longestCount;
    }

    public static void main(String[] args) {
        int a[] = {100, 101, 200, 1, 2, 4, 3};

        int ans = longestContSequence(a);

        System.out.println(ans);
    }
}