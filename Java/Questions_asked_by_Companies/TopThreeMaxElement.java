package Questions_asked_by_Companies;


import java.util.*;


// Design an algorithm to accept 20 integer elements for an array and print the maximum 3 and minimum 3 elements from the array.
// 17 93 8 61 42 77 5 26 84 39 10 3 68 51 29 94 13 72 30 86
public class TopThreeMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[20];
        for(int i = 0; i < 20; i++){
            arr[i] = sc.nextInt();
        }
        
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1){
                max3 = max2;
                max2 = arr[i];
            }
            else if(arr[i] > max3 && arr[i] != max2 && arr[i] != max1){
                max3 = arr[i];
            }
        }
        
        int[] MaxThree = {max1,max2,max3};
        System.out.println(Arrays.toString(MaxThree));
    }
}
