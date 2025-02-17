import java.util.Scanner;

public class removeStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String newString = removeStars(s);
        System.out.println(newString);
    }
    static String removeStars(String s) {
        StringBuilder newString = new StringBuilder();
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                continue;
            } 
            newString.append(s.charAt(i));
        }
        return newString.toString();
    }
}
