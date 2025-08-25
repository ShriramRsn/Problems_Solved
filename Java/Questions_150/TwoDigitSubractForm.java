// 25. 2 digit reduced subtracted form 
// Ex. 6928 
// 6-9= 3 
// 9-2=7 
// 2- 8=6 
// O/p: 376 
// Not 2 digit num 
// Again perform RS 
// 3-7=4 
// 7-6=1 
// O/P:41 

public class TwoDigitSubractForm {
    public static void main(String[] args) {
        int input1 = 6928;
        System.out.println(twoDigitSubtractForm(input1));
    }

    static int twoDigitSubtractForm(int input1){
        String str = Integer.toString(input1);
        int len = str.length();
        int sub = 0;
        int startTwo = input1 / (int) Math.pow(100, len - 1) % 10;
        // while(len > 0){
        //     int start = input1 / (int) Math.pow(10, len -1) % 10;
            

        // }
        return startTwo;
    }
}
