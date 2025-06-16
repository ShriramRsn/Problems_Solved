public class UniqueDigitsCount {
    public static void main(String[] args) {
        int input1 = 1015;
        System.out.println(uniqueDigitsCount(input1));
    }

// 16. Unique Digits Count: 
    static int uniqueDigitsCount(int input1){
        int result = 0;
        int[] count = new int[10];
        while(input1 > 0){
            int digit = input1 % 10;
            count[digit]++;
            input1 /= 10;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] >= 1){
                result++;
            }
        }
        return result;
    }
}
