package Questions_asked_by_Companies;

import java.util.*;

public class SplitWordsBySeparator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one.two.three");
        list.add("four.five");
        list.add("six");
        List<String> ls = splitWordsBySeparator(list, '.');
        System.out.print(ls);

    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            int start = 0;
            int end = word.indexOf(separator);
            while (start <= word.length()) {
                if (end == -1) {
                    if (start < word.length()) {
                        String part = word.substring(start);
                        if (!part.isEmpty()) {
                            list.add(part);
                        }
                    }
                    break;
                } else {
                    if (start < end) {
                        String part = word.substring(start, end);
                        if (!part.isEmpty()) {
                            list.add(part);
                        }
                    }
                    start = end + 1;
                    end = word.indexOf(separator, start);
                }
            }
        }
        return list;
    }
}
