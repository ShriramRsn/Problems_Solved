import java.util.Scanner;

public class Starsum {

    public static long calculateStarSum(int M) {
        long starSum = 0;
        long currentNumber = M;
        long divisor = 1;

        // Calculate the number of digits to determine the largest divisor (e.g., 10, 100, 1000)
        while (divisor * 10 <= M) {
            divisor *= 10;
        }

        while (divisor >= 1) {
            starSum += currentNumber;
            currentNumber %= divisor; // Get the remainder (removes the first digit)
            divisor /= 10;
        }
        return starSum;
    }

    public static int solve(int N) {
        int count = 0;
        for (int M = 1; M <= N; M++) {
            long starSumOfM = calculateStarSum(M);
            if (starSumOfM > N) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer N: ");
        int N = scanner.nextInt();

        int result = solve(N);
        System.out.println("Output: " + result);

        scanner.close();
    }
}