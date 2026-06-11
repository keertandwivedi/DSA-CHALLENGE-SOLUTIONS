import java.util.*;

public class Main {

    public static void selectionSort(int[] arr, int size) {
        for(int i = 0 ; i<size ; i++){
            int minIndex = i ;
            for(int j = i+1 ; j<size ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j ;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 5,8,555,0};
        int size = arr.length;

        selectionSort(arr, size);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}