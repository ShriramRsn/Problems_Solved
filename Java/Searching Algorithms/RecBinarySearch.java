public class RecBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int target = 3;
        int index = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
            int mid = start + (end - start) / 2;
            if(start > end){
                return -1;
            }
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                return binarySearch(arr, target, start, mid - 1);
            }
     return binarySearch(arr, target, mid + 1, end);
    }
}
