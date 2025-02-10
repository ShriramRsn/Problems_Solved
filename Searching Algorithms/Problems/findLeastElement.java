public class findLeastElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 100};
        int ans = findLeastElement(nums);
        System.out.println(ans);
    }

    static int findLeastElement(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
