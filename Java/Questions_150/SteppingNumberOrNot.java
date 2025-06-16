// 32. Stepping Number or Not 
//      Neighbor number difference can be either -1 or 1 
//      Input-1 = 12345 
//      Output: Yes 
//      Input-2 = 1245
//      Output: No 

public class SteppingNumberOrNot {
    public static void main(String[] args) {
        int input1 = 12345;
        if(steppingNumberOrNot(input1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    static boolean steppingNumberOrNot(int input1){
        boolean isSteppingNumber = true;
        int prevDigit = input1 % 10;
        input1 /= 10;
        while(input1 > 0){
            int curdigit = input1 % 10;
            if(Math.abs(curdigit - prevDigit) != 1){
                isSteppingNumber = false;
                break;
            }
            prevDigit = curdigit;
            input1 /= 10;
        }

        return isSteppingNumber;
    }
}
