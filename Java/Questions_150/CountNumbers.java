package Questions_150;
import java.util.*;

public class CountNumbers {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int positives = 0, negatives = 0, zeros = 0;

        for (int num : arr) {
            if (num > 0) positives++;
            else if (num < 0) negatives++;
            else zeros++;
        }

        System.out.println("Positive Numbers are: " + positives);
        System.out.println("Negative Numbers are: " + negatives);
        System.out.println("Zeros are: " + zeros);
    }
}
