import java.util.*;

public class Main {
    public static ArrayList<Integer> merge(ArrayList<Integer> a ,ArrayList<Integer> b){
       int i = 0 ;
       int j = 0; 
       ArrayList<Integer> newAns = new ArrayList<>();
       while(i<a.size() && j<b.size()){
          if(a.get(i)<b.get(j)){
             newAns.add(a.get(i));
             i++;
          }
          else{
             newAns.add(b.get(j));
             j++;
          }
       }
       while(i<a.size()){
             newAns.add(a.get(i));
             i++;
       }
       while(j<b.size()){
             newAns.add(b.get(j));
             j++;
       }
       return newAns;
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> arr , int low , int high){
        if(low==high){
            ArrayList<Integer> base = new ArrayList<>();
            base.add(arr.get(low));
            return base ;
        }
        int mid = low + (high-low) / 2 ;
        ArrayList<Integer>a = mergeSort(arr,low,mid);
        ArrayList<Integer>b = mergeSort(arr,mid+1,high); 
        return merge(a,b);
    } 

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 5, 8, 555, 0};

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int num : arr) {
            arrList.add(num);
        }

        ArrayList<Integer> sorted = mergeSort(arrList, 0, arrList.size() - 1);

        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}