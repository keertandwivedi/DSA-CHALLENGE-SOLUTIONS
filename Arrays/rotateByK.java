import java.util.*;

public class Main {
    
    public static void reverseArray(ArrayList<Integer> a ,int st ,int end) {
        while(st<end){
            int temp = a.get(st);
            a.set(st,a.get(end));
            a.set(end,temp);
            st++;
            end--;
        }
    }

    public static void roatateLeftByK(ArrayList<Integer> a, int k) {
       if(a.size() == 0 || k==0){
        return;
       } 
       k = k%a.size();
       reverseArray(a,0,a.size()-1);
       reverseArray(a,0,k-1);
       reverseArray(a,k,a.size()-1);
       return ;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 5, 2, 1, 7, 9));
        int k = 15;

        roatateLeftByK(a,2);
        for(int el:a){
            System.out.print(el + " ");
        }
    }
}