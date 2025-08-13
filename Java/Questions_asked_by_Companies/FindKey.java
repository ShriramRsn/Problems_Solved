package Questions_asked_by_Companies;
import java.util.*;
public class FindKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        // int input4 = sc.nextInt();

        System.out.println(findKey1(input1,input2,input3));
    }

    static int findKey1(int a, int b, int c){
        int[] nums = {a,b,c};
        int sumLarge = 0;
        int sumSmall = 0;
        for(int num : nums){
            int large = 0;
            int small = 9;
            while(num>0){
                int digit = num % 10;
                if(digit > large){
                    large = digit;
                }
                if(digit < small){
                    small = digit;
                }
                num/=10;
            }
            sumLarge += large;
            sumSmall += small;
        }
        return sumLarge - sumSmall;
    }

    static int findKey2(int a, int b, int c){
        int thousandDigit = a / 1000;
        int hundredDigit = ( b / 100 ) % 10;
        int smallDigit = 9;
        int temp = c;
        while(temp > 0){
            int digit = temp % 10;
            if(digit < smallDigit){
                smallDigit = digit;
            }
            temp /= 10;
        }
        return (thousandDigit*hundredDigit) + smallDigit;
    }

    static int findPIN(int a, int b, int c,int d){
        int sum = 0;
        String num = String.valueOf(a) + b + c;
        for(char i : num.toCharArray()){
            int digit = i - '0';
            if(d % 2 == 0){
                if(digit % 2 == 0){
                    sum += digit;
                }
            }
            else{
                if(digit % 2 != 0){
                    sum += digit;
                }
            }
        }
        return sum;
    }
}
