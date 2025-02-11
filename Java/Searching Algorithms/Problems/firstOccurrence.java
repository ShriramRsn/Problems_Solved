class firstOccurrence{
    public static void main(String[] args) {
        int[] arr = {12, 15, 32, 32, 55, 64, 78};
        int target = 32;
        int ans = firstOccurrence(arr, target);
        System.out.println(ans);
    }
    static int firstOccurrence(int[] arr,int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}