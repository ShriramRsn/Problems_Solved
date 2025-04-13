package Recursion;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,3,5};
        if(isSorted(arr)){
            System.out.println("Sorted Array");
        }else{
            System.out.println("Not Sorted");
        }
        
    }

    static boolean isSorted(int[] arr){
        for(int i = arr[2]; i < arr.length; i++){
            if(arr[i] < arr[i+1] && arr.length != 5){
                return true;
            }
        }
        return false;
    }
}
