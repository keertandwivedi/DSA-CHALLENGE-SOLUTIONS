import java.util.*;

public class Main {

    public static int merge(int[] a, int l, int r, int m) {

        int[] temp = new int[r - l + 1];

        int i = l;
        int j = m + 1;
        int k = 0;
        int count = 0;

        while (i <= m && j <= r) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                count += (m - i + 1);
                temp[k++] = a[j++];
            }
        }

        while (i <= m) {
            temp[k++] = a[i++];
        }

        while (j <= r) {
            temp[k++] = a[j++];
        }

        for (i = l; i <= r; i++) {
            a[i] = temp[i - l];
        }

        return count;
    }

    public static int CountInversion(int[] a, int low, int high) {

        if (low >= high)
            return 0;

        int mid = (low + high) / 2;

        int count = 0;

        count += CountInversion(a, low, mid);
        count += CountInversion(a, mid + 1, high);

        count += merge(a, low, high, mid);

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        int inversions = CountInversion(arr, 0, arr.length - 1);

        System.out.println("The number of inversions is: " + inversions);
    }
}