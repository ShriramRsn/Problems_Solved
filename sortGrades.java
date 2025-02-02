import java.util.*;
public class sortGrades {
    public static void main(String[] args) {
        int[] arr = new int[]{78, 92, 45, 67, 89, 53};
        sortGrades(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortGrades(int[] arr){
        boolean Swapped;
        for(int i = 0; i < arr.length; i++){
            Swapped = false;
            for(int j = 1; j < arr.length -i;j++){
                if(arr[j] < arr[j-1]){
                    arr[j] = arr[j] + arr[j-1];
                    arr[j-1] = arr[j] - arr[j-1];
                    arr[j] = arr[j] - arr[j-1];
                    Swapped = true;
                }
            }
            if(!Swapped){
                break;
            }
        }
    }
}
//Output: [45, 53, 67, 78, 89, 92]