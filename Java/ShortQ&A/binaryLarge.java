public class binaryLarge {
    public static void main(String[] args) {
        int arr[] = new int[]{2,1,7,6,5,4,3};
        System.out.println(arr[largeElement(arr)]);
    }

    static int largeElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){ 
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            } else {
                end = mid; 
            }
        }
        return start;
    }
}