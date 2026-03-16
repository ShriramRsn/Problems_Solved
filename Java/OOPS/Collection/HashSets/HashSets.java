package OOPS.Collection.HashSets;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(11);
        set.add(13);

        Set<Integer> set1 = new HashSet<>(set);
        set1.remove(2);
        set1.retainAll(set);
        System.out.println(set);
        System.out.println(set1);
    }
}
