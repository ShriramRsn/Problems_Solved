import java.util.*;

public class mergeTwoArray {
    public static void main(String[] args) {
        int[] merged = input();
        System.out.println(Arrays.toString(merged));
        int unique = 0;
        for(int i : merged){
            unique ^= i;
        }
        System.out.println(unique);
    }

    static int[] input(){
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int[] arr1 = new int[l1];
        int[] arr2 = new int[l1];
        for(int i = 0; i < l1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < l1; i++){
            arr2[i] = sc.nextInt();
        }
        return mergedArray(arr1,arr2,l1);
    }

    static int[] mergedArray(int[] arr1, int[] arr2, int len){
        int[] arr3 = new int[len*2];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i=0; i < arr2.length; i++){
            arr3[i+arr1.length] = arr2[i];
        }
        return arr3;
    }
}
