// 29. Program to reverse the number using a loop
// Ex: 143
// Output: 341
public class IntegerReverse {
    public static void main(String[] args) {
        int input = 143;
        System.out.println(intReverse(input));
    }

    static int intReverse(int input) {
        int rev = 0;
        while(input > 0){
            int digit = input % 10;
            rev = rev*10 + digit;
            input /= 10;
        }
        return rev;
    }
}
