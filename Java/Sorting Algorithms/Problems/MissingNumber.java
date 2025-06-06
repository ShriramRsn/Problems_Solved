public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{3,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                    swap(arr, i, arr[i]);
            }
            else{
                i++;
            }
        }
        // searching for missingNumber
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
