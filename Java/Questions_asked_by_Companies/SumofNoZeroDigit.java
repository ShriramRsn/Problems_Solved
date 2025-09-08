// 1317. Convert Integer to the Sum of Two No-Zero Integers
package Questions_asked_by_Companies;
import java.util.*;

public abstract class SumofNoZeroDigit {
    public static void main(String[] args){
        int digit = 2;
        System.out.println(Arrays.toString(getNoZeroIntegers(digit)));
    }

    public static int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (check(a) && check(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{};
    }

    private static boolean check(int num) {
        while (num != 0) {
            if (num % 10 == 0) return false;
            num /= 10;
        }
        return true;
    }
}
    
