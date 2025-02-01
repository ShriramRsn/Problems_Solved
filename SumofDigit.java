import java.util.*;
public class SumofDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = sc.nextInt();

        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(99);
        }
        System.out.println(Arrays.toString(arr)); 

        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int[] ans = SumofDigit(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] SumofDigit(int[] arr,int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
                else if(arr[i] == target){
                    return new int[]{i};
                }
            }
        }
        return new int[]{};
    }
}
