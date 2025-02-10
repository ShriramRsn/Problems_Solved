import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give array length: ");
        int len = sc.nextInt();

        System.out.print("Target: ");
        int target = sc.nextInt();

        int arr[][] = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean ans = searchMatrix(arr, target);
        System.out.println(ans);
        sc.close();
    }

    static boolean searchMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
