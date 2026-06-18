import java.util.*;

public class Main {

    public static void generateAllPermuatations(ArrayList<Integer> a,
                                                List<List<Integer>> ans,
                                                int index) {
        if (index >= a.size()) {
            ans.add(new ArrayList<>(a)); // store a copy
            return;
        }

        for (int j = index; j < a.size(); j++) {

            // swap
            int temp = a.get(index);
            a.set(index, a.get(j));
            a.set(j, temp);

            // recursion
            generateAllPermuatations(a, ans, index + 1);

            // backtrack (swap back)
            temp = a.get(index);
            a.set(index, a.get(j));
            a.set(j, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));

        List<List<Integer>> ans = new ArrayList<>();

        generateAllPermuatations(a, ans, 0);

        for (List<Integer> list : ans) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}