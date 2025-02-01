import java.util.*;
public class vowelsUsingSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        //first the boolean is false to mark the start
        boolean foundVowels = false;
        for(int i=0; i < string.length(); i++){
            char ch = string.charAt(i);
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                System.out.print(ch + " ");
                //To mark if the vowels if found
                foundVowels = true;
                break;
                default:
                break;
            }
        }
        //if no vowels found.
        if (!foundVowels) {
            System.out.println("No Vowels");   
        }
    }
}
