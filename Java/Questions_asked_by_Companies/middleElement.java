package Questions_asked_by_Companies;

public class middleElement {
    public static void main(String[] args) {
        int size = 3;
        int[] arr = new int[size];
        int result = findMiddleElement(arr);
        System.out.println(result);
    }

    static int findMiddleElement(int[] arr) {
        arr = new int[]{1, 2, 3};
        if (arr.length % 2 == 0) {
            return -1;
        } else {
            int middleIndex = arr.length / 2;
            return arr[middleIndex];
        }
    }
}