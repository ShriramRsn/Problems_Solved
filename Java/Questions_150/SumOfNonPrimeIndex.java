public class SumOfNonPrimeIndex{
    public static void main(String[] args){
        int[] nums = {10,20,30,40,50,60,70,80,90,100};
        int len = nums.length;
        System.out.println(sumOfNonPrimeIndex(nums,len));
    }

    static int sumOfNonPrimeIndex(int[] nums, int len){
        int sum = 0;
        for(int i = 0; i < len; i++){
            if(!isPrime(i)){
                sum += nums[i];
            }
        }
        return sum;
    }

    static boolean isPrime(int input1){
        if(input1 <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= input1){
            if(input1 % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}