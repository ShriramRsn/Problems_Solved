package Recursion;

public class BinarySearch {
        int binarySearch(int arr[], int left, int right, int x){
           if (right >= left){
              int mid = left + (right - left) / 2;
              if (arr[mid] == x)
              return mid;
              if (arr[mid] > x)
              return binarySearch(arr, left, mid - 1, x);
              return binarySearch(arr, mid + 1, right, x);
           }
           return -1;
        }
        public static void main(String args[]){
           BinarySearch bs = new BinarySearch();
           int arr[] = { 56, 78, 90, 32, 45, 99, 104};
           int len = arr.length;
           int x = 104;
           int result = bs.binarySearch(arr, 0, len - 1, x);
           if (result == -1)
              System.out.println("The element is not present in the array");
           else
              System.out.println("The element has been found at index " + result);
        }
}
