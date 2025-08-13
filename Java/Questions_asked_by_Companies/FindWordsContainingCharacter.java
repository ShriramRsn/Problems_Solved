package Questions_asked_by_Companies;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) == x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
