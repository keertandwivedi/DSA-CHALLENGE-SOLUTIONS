import java.util.*;

public class Main {

    public static void mergeTwoSorted(int[]a , int[]b , int m , int n) {
        int i = m-1 ;
        int k = m+n-1 ;
        for(int j=n-1; j>=0 ; j--){
            while(i>=0 && a[i]>b[j]){
                a[k--] = a[i--];
            }
            a[k--] = b[j];
        }
    }
    

    public static void main(String[] args) {
        int a[] = {1,4,7,88,110,0,0,0,0,0};
        int b[] = {2,4,6,99,120};
        int m = 5 ;
        int n = 5 ;
        mergeTwoSorted(a,b,m,n);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}