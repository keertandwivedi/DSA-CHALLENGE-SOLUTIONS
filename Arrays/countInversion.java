import java.util.*;

public class Main {
    // Function to count inversions
    static int numberOfInversions(int[] arr) {
        int cnt = 0; // Initialize count
        int n = arr.length;
        // Check all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) cnt++; // Increment if inversion found
            }
        }
        return cnt; // Return total inversions
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int inversions = numberOfInversions(arr);
        System.out.println("The number of inversions is: " + inversions);
    }
}