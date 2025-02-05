import java.util.Arrays;

public class sumOfDigitBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7 , 8, 9};
        int target = 15;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

        static int[] twoSum(int[] numbers, int target) {
            int start = 0;
            int end = numbers.length - 1;
            while(start <= end){
                int sum = numbers[start] + numbers[end];
                if(target == sum){
                    return new int[]{start+1,end+1};
                }
                else if(target > sum){
                    start++;
                }
                else {
                    end--;
                }
    
            }
            return new int[]{};
        }
}
