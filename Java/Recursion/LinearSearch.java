package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,4,5};
        System.out.println(linearSearch(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }

    static boolean linearSearch(int[] arr, int target, int index){
        if(index == arr.length - 1){
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length - 1){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else{
            return findIndex(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target, int index){
        if(index ==  arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
}
