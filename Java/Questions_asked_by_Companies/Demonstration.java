package Questions_asked_by_Companies;

public class Demonstration {
    static String trim(String s){
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            if(str.charAt(i) != ' ') break;
            else str.deleteCharAt(i);
        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(str.charAt(i) != ' ') break;
            else str.deleteCharAt(i);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "   abcdef   ";
        s = trim(s);
        System.out.println(s);
    }
}
