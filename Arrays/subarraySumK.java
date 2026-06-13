import java.util.*;

public class Main {

    public static int findSubarrayKlen(ArrayList<Integer> a, int k) {
        int maxLen = 0 ;
        for(int i=0;i<a.size();i++){
            int sum = 0 ;
            for(int j=i ; j<a.size();j++){
                sum = sum+a.get(j);
                if(sum==k){
                   int currLen = j - i + 1;
                   maxLen = Math.max(maxLen, currLen);
                }
                if(sum>k){
                    break;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 5, 2, 1, 7, 9));
        int k = 15;

        int ans = findSubarrayKlen(a, k);

        System.out.println("Longest length = " + ans);
    }
}