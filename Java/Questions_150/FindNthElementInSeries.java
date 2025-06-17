import java.util.*;
public class FindNthElementInSeries{
    public static void main(String[] args){
        int a = 1;
        int b = 3;
        int c = 6;
        int N = 17;
        System.out.println(seriesN(a,b,c,N));
    }

    static int seriesN(int input1,int input2,int input3,int input4){
        int gap1 = input2 - input1;
        int gap2 = input3 - input2;
        int sum = input1;
        for(int i = 1; i < input4; i++){
            if(i % 2 == 1){
                sum += gap1;
            }
            else{
                sum += gap2;
            }
        }
        return sum;
    }
}