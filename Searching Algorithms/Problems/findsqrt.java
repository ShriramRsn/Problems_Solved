//To find sqrt of number using binarySearch

import java.util.Scanner;

public class findsqrt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = sqrt(x);
        System.out.println(ans);
    }

    static int sqrt(int x){
        int start = 0;
        int end = x;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long val = mid * mid;
            if(val <= (long)(x)){
                start =(int) mid + 1;
            }
            else{
                end =(int) mid - 1;
            }
        }
        return end;
    }
}