package Questions_asked_by_Companies;
public class BalancePoint {
    public static void main(String[] args) {
        int[] nums = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(balancePoint(nums));
    }
    

    // balancePoint brute force approach
    static int balancePoint(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int left = 0;
            for(int j = 0; j < i; j++){
                left += nums[j];
            }
            
            int right = 0;
            for(int j = i + 1; j < nums.length; j++){
                right += nums[j];
            }
            
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}
