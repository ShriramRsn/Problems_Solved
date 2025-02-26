public class UniqueValue{
    //Using XOR Operator to find the unique element in an array
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,4,5};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int unique = 0;
        for(int i : arr){
            unique ^= i;
        }
        return unique;
    }
}