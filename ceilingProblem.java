public class ceilingProblem {
    public static void main(String[] args) {
        int[] arr = {-1,8,16,27,31,48,59,66,89};
        int target = 32;
        int ans = ceilingProblem(arr, target);
        System.out.println(ans);
    }
    static int ceilingProblem(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return arr[start];
    }
}