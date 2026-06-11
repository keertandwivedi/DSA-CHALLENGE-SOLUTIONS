import java.util.*;

public class Main {

    public static void insertionSort(int[] arr, int size) {
        for(int i = 1 ; i<size ; i++){
            int prev = i-1 ;
            int currElement = arr[i] ;
            while(prev >= 0 && arr[prev]>currElement){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 5,8,555,0};
        int size = arr.length;

        insertionSort(arr, size);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}