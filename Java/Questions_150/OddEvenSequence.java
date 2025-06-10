// 27. Arrangement of odd sequence followed by even sequence
// i/P:361589
// o/p: 315968
public class OddEvenSequence {
    public static void main(String[] args) {
        int input = 361589;
        System.out.println(oddEvenSequence(input));
    }

    static StringBuilder oddEvenSequence(int input){
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        while(input > 0){
            int digit = input % 10;
            if(digit % 2 != 0){
                odd = odd.append(digit);
            }
            else{
                even = even.append(digit);
            }
            input /= 10;
        }
        return new StringBuilder().append(odd).append(even);
    }
}
