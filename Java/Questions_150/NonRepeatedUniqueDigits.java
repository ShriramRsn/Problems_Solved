public class NonRepeatedUniqueDigits {
    public static void main(String[] args) {
        int input1 = 1015;
        System.out.println(nonRepeatedUniqueDigits2(input1));
    }

    // 17. Non-Repeated Digits Count:
    static int nonRepeatedUniqueDigits(int input1) {
        int[] count = new int[10];
        if (input1 == 0) {
            return 1;
        }
        input1 = Math.abs(input1);
        while (input1 > 0) {
            int digit = input1 % 10;
            count[digit]++;
            input1 /= 10;
        }
        int countUniqueOccurence = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                countUniqueOccurence++;
            }
        }
        return countUniqueOccurence;
    }

    public static int nonRepeatedUniqueDigits2(int input1) {
        int[] count = new int[10];
        int uniqueCount = 0;

        if (input1 == 0) {
            return 1;
        }
        input1 = Math.abs(input1);

        while (input1 > 0) {
            int digit = input1 % 10;

            if (count[digit] == 0) {
                uniqueCount++;
            } else if (count[digit] == 1) {
                uniqueCount--;
            }

            count[digit]++;
            input1 /= 10;
        }

        return uniqueCount;
    }
}