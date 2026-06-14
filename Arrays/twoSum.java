import java.util.*;

public class Main {
    //brute force approch 0n**2
    public static boolean twoSum(ArrayList<Integer> a, int tg) {
        for(int i=0;i<a.size() ;i++){
            int rem = tg-a.get(i);
            for(int j = i+1 ; j<a.size();j++){
                if(a.get(j)==rem){
                   return true;
                }
            }
        }
        return false ;
    }
    
    //with space 
    public static boolean twoSum(ArrayList<Integer> a, int tg) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<a.size() ;i++){
            int rem = tg-a.get(i);
            if(map.containsKey(rem)){
                return true;
            }
            map.put(a.get(i),i);
       }
       return false;
        
    }

    //optimal using greedy
    public static boolean twoSum(ArrayList<Integer> a, int tg) {
        int i = 0 ;
        int j = a.size()-1 ;
        while(i<j){
            if(a.get(i)+a.get(j)==tg){
               return true;
            }
            else if(a.get(i)+a.get(j)>tg){
               j--;
            }
            else{
               i++;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 5, 2, 1, 7, 2));
        Collections.sort(a);

        int tg = 150;
       
        boolean ans = twoSum(a,tg);
        if(ans){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}