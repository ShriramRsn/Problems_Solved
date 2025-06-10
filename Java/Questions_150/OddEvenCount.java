// 30. Problem to count the total number of odd and even in the given any digit number
// Input = 53467
// Ans:
// Odd=3
// Even=2
public class OddEvenCount {
    public static void main(String[] args) {
        int input = 53467;
        System.out.println(oddEvenSequence(input));
    }

    static String oddEvenSequence(int input) {
        int oddCount = 0;
        int evenCount = 0;
        while (input > 0) {
            int digit = input % 10;
            if (digit % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
            input /= 10;
        }
        String result = "Odd = " + oddCount + "\nEven = " + evenCount;
        return result;
    }
}
