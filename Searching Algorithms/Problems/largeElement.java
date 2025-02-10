//largest element in an array using linear search and 
public class largeElement {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 8, 7, 56, 90, -100};
        System.out.println(largeElement(arr));
    }

    static int largeElement(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ans){
                ans = arr[i-1];
            }
        }
        return ans;
    }
}
