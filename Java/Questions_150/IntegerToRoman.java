import java.util.*;
public class IntegerToRoman {
    public static void main(String[] args){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        StringBuilder roman = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(input >= values[i]){
                input -= values[i];
                roman.append(symbols[i]);
            }
        }

        System.out.println("Roman Representation of " + input + " :" + roman.toString());
    }
}
