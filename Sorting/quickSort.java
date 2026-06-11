import java.util.*;

public class Main {
    
    public static int partition(int[] arr, int low , int high) {
        int pivot = arr[low];
        int i = low ; 
        int j = high ;
        while(i<j){
            while(i<high && arr[i]<=pivot){
                i++;
            }
            while(j>low && arr[j]>pivot ){
                j--;
            }
            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp ;
            } 
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }
    public static void quickSortHelper(int[] arr, int low , int high) {
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            quickSortHelper(arr,low,pivotIndex-1);
            quickSortHelper(arr,pivotIndex+1,high);
        }
    }
    public static void quickSort(int[] arr, int size) {
        int low = 0 ;
        int high = size ;
        quickSortHelper(arr,low,high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 5,8,555,0};
        int size = arr.length;

        quickSort (arr, size-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}