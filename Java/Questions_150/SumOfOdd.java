public class SumOfOdd {
    public static void main(String[] args) {
        int input = 361589;
        System.out.println(sum_SequenceOfOdd(input));
    }

    static StringBuilder sum_SequenceOfOdd(int input) {
        int sum = 0;
        StringBuilder even = new StringBuilder();
        while (input > 0){
            int digit = input % 10;
            if(digit % 2 != 0){
                sum = sum + digit;
                even.append(digit);
            }
            input /= 10;
        }
        return new StringBuilder().append(even.reverse()).append(sum);
    }
}
