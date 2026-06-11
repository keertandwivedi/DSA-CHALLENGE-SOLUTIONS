import java.util.*;

public class Main {

    public static void bubbleSort(int[] arr, int size) {
        for (int i = size - 1; i > 0; i--) {
            boolean isSwapped = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 5,8,555,0};
        int size = arr.length;

        bubbleSort(arr, size);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}