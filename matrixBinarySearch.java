public class matrixBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
            {7,15,34,41},
            {45,49,55,76}
        };
        int target = 55;
        boolean ans = searchMatrix(arr, target);
        System.out.println(ans);
    }
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
