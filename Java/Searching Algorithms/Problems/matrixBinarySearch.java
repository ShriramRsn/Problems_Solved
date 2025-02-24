
import java.util.Arrays;

public class matrixBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 8;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    //simple
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length - 1;
        while(row < matrix.length && col >=0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            else if (matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    //little complex
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row * col - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midValue = matrix[mid / col][mid % col];
            if(midValue == target){
                return true;
            }
            else if(midValue < target){
                start = mid + 1;
            }
            else{
                end = mid - 1; 
            }
        }
        return false;
    }
}
