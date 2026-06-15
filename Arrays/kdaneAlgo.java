import java.util.*;

public class Main {

    public static int maxSum(ArrayList<Integer> a) {
        int maxSum  = 0 ;
        int currSum = a.get(0);
        for(int i=1; i<a.size(); i++){
            currSum += a.get(i);
            maxSum = Math.max(currSum,maxSum);
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, -5, 2, -10, 7, 9));
        int k = 15;

        int ans = maxSum(a);

        System.out.println("Longest sum = " + ans);
    }
}