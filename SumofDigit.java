import java.util.*;
public class SumofDigit {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5,10};
        int target = 15;
        int[] ans = SumofDigit(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] SumofDigit(int[] arr,int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
