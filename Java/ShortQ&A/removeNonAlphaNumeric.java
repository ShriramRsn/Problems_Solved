import java.util.Scanner;

public class removeNonAlphaNumeric {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("AlphaNumeric:" + AlphaNumeric(str));
    }

    static String AlphaNumeric(String str){
        StringBuilder alphanumeric = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                alphanumeric.append(c);
            }
        } 
        return alphanumeric.toString();
    }

}
