import java.util.*;

public class Main {

    public static int findSubarrayKlen(ArrayList<Integer> a, int k, int i, int sum, int len) {

        if (i == a.size()) {
            if (sum == k) {
                return len;
            }
            return 0;
        }

        // Include current element
        int include = findSubarrayKlen(a, k, i + 1, sum + a.get(i), len + 1);

        // Exclude current element
        int exclude = findSubarrayKlen(a, k, i + 1, sum, len);

        return Math.max(include, exclude);
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 5, 2, 1, 7, 9));
        int k = 15;

        int ans = findSubarrayKlen(a, k, 0, 0, 0);

        System.out.println("Longest length = " + ans);
    }
}