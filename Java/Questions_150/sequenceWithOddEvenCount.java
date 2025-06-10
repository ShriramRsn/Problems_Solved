// 28. Arrangement of odd sequence with count followed by even sequence with count
// i/p: 361589
// o/p: 31594682
public class sequenceWithOddEvenCount {
    public static void main(String[] args) {
        int input = 361589;
        System.out.println(oddEvenSequence(input));
    }

    static StringBuilder oddEvenSequence(int input) {
        StringBuilder odd = new StringBuilder();
        int oddCount = 0;
        StringBuilder even = new StringBuilder();
        int evenCount = 0;
        while (input > 0) {
            int digit = input % 10;
            if (digit % 2 != 0) {
                odd = odd.append(digit);
                oddCount++;
            } else {
                even = even.append(digit);
                evenCount++;
            }
            input /= 10;
        }
        return new StringBuilder().append(odd.reverse()).append(oddCount).append(even.reverse()).append(evenCount);
    }

}
