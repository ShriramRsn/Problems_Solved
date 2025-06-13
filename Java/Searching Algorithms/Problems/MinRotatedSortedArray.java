public class MinRotatedSortedArray {
    // public static int findMin(int[] nums) {
    //     int start = 0;
    //     int end = nums.length - 1;

    //     while (start < end) {
    //         int mid = start + (end - start) / 2;

    //         if (nums[mid] > nums[end]) {
    //             start = mid + 1;
    //         } else {
    //             end = mid;
    //         }
    //     }

    //     return nums[start];
    // }

    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int[] nums = {2,2,2,0,1};
        int result = findMin(nums);
        System.out.println(result);
    }
}
