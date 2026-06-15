import java.util.*;

public class Main {
    
    public static void sortZeroOneTwo(ArrayList<Integer> a) {
        int i = 0;
        int j = 0;
        int k = a.size() - 1;

        while (j <= k) {
            if (a.get(j) == 0) {
                int temp = a.get(i);
                a.set(i, a.get(j));
                a.set(j, temp);
                i++;
                j++;
            }
            else if (a.get(j) == 1) {
                j++;
            }
            else { 
                int temp = a.get(j);
                a.set(j, a.get(k));
                a.set(k, temp);
                k--;
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,0,2,1,2,1,0));
        sortZeroOneTwo(a);
        for(int el : a){
            System.out.print(el + " ");
        }
    }
}