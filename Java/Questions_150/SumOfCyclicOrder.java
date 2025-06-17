import java.util.*;
public class sumOfCyclicOrder{
    public static void main(String[] args){
        int nums = 1234;
        System.out.println(sumOfCyclicOrder(nums));
    }
    
    static int sumOfCyclicOrder(int nums){
        String str = Integer.toString(nums);
        int left = 0;
        int right = 0;
        int sum = 0;
        while(left < str.length()){
            while(right < str.length()){
                sum += Integer.valueOf(str.charAt(right) + "");
                right++;
            }
            left++;
            right = left;
        }
        return sum;
    }
}