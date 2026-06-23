import java.util.*;

public class Main {

    static class Pair<U, V> {
        U first;
        V second;

        Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }
    }

    public static Pair<Integer, Integer> repeatTwice(int[] a) {
        int n = a.length;

        int[] hashed = new int[n + 1];

        for (int i = 0; i < a.length; i++) {
            hashed[a[i]]++;
        }

        int rep = -1;
        int missing = -1;

        for (int i = 1; i < hashed.length; i++) {
            if (hashed[i] == 2) {
                rep = i;
            }
            if (hashed[i] == 0) {
                missing = i;
            }
        }

        return new Pair<>(rep, missing);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 4};

        Pair<Integer, Integer> p = repeatTwice(a);

        System.out.println("Repeated = " + p.first);
        System.out.println("Missing = " + p.second);
    }
}