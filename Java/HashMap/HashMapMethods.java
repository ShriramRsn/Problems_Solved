package HashMap;

import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Shriram", 84);
        map.put("Kunal", 99);
        map.put("Sankar", 94);
        map.put("Ajay", 87);

        System.out.println(map.hashCode());

    }
}
