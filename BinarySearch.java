import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,24,32,36,45,56,69,78};
        System.out.print("Enter target element to search in array: ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int ans = ascSearch(arr, target);
        System.out.println(ans);
        input.close();
    }
    //If the given array is in ascending order
    static int ascSearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            //finding the mid value
            int mid = start + (end - start) / 2;
            //search in left side of the array to find the target value 
            if (target < arr[mid]) {
                //end decrease
                end = mid - 1;
            }
            //search in right side of the array to find the target value
            else if (target > arr[mid]){
                //Start increase
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
