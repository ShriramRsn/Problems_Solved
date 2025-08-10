package Questions_150;
public class FindKey {
    public static void main(String[] args) {
        int input1 = 3521, input2 = 2452, input3 = 1352;
        int key = getKey(input1) + getKey(input2) + getKey(input3);
        System.out.println("Key = " + key);
    }

    static int getKey(int num) {
        int smallest = 9, largest = 0;
        while (num > 0) {
            int digit = num % 10;
            smallest = Math.min(smallest, digit);
            largest = Math.max(largest, digit);
            num /= 10;
        }
        return smallest + largest;
    }
}
