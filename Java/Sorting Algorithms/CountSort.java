import java.util.*;

public class CountSort {
    public static void sortColors(int[] nums) {
        if( nums == null || nums.length <= 1){
            return ;
        }
        int max = nums[0];
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        int[] countArray = new int[max+1];
        for(int num : nums){
            countArray[num]++;
        }
        int index = 0;
        for(int i = 0; i <= max; i++){
            while(countArray[i] > 0){
                nums[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);  
        System.out.println(Arrays.toString(arr));
    }
}
