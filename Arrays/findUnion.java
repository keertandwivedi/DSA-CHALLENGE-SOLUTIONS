import java.util.*;

public class Main {

    public static ArrayList<Integer> findUnion(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> newAns = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.size() && j < b.size()) {

            if (a.get(i) < b.get(j)) {
                if (newAns.isEmpty() || newAns.get(newAns.size() - 1) != a.get(i)) {
                    newAns.add(a.get(i));
                }
                i++;
            }

            else if (a.get(i) > b.get(j)) {
                if (newAns.isEmpty() || newAns.get(newAns.size() - 1) != b.get(j)) {
                    newAns.add(b.get(j));
                }
                j++;
            }

            else {
                if (newAns.isEmpty() || newAns.get(newAns.size() - 1) != a.get(i)) {
                    newAns.add(a.get(i));
                }
                i++;
                j++;
            }
        }

        while (i < a.size()) {
            if (newAns.isEmpty() || newAns.get(newAns.size() - 1) != a.get(i)) {
                newAns.add(a.get(i));
            }
            i++;
        }

        while (j < b.size()) {
            if (newAns.isEmpty() || newAns.get(newAns.size() - 1) != b.get(j)) {
                newAns.add(b.get(j));
            }
            j++;
        }

        return newAns;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(10, 20, 30));

        ArrayList<Integer> unionArr = findUnion(a, b);

        for (int element : unionArr) {
            System.out.print(element + " ");
        }
    }
}