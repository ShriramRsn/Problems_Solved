public class isEvenOdd {
    public static void main(String[] args) {
        int input = 4;
        int input1 = 197;
        int input2 = 154;
        int input3 = 754;
        int input4 = 175;
        int input5 = 444;
        String input6 = "even";
        System.out.println(isEven(input));
        System.out.println(isOdd(input));
        System.out.println(countEvens(input1,input2,input3,input4,input5));
        System.out.println(evenOrOddCount(input1, input2, input3, input4, input5, input6));
        
    }

// 1. IS EVEN?
    static int isEven(int input) {
        input = Math.abs(input);
        if(input % 2 == 0 || input == 0){
            return 2;
        }
        return 1;
    }

// 2. IS ODD?
    static int isOdd(int input) {
            input = Math.abs(input);
        if(input % 2 != 0){
            return 2;
        }
        return 1;
	}
// 7/8. Of given 5 numbers, how many are even/odd?
    static int countEvens(int input1, int input2, int input3, int input4, int input5) {
        int countEvens = 0;
        if(input1 % 2 == 0){
            countEvens++;
        }
        if(input2 % 2 == 0){
            countEvens++;
        }
        if(input3 % 2 == 0){
            countEvens++;
        }
        if(input4 % 2 == 0){
            countEvens++;
        }
        if(input5 % 2 == 0){
            countEvens++;
        }
        return countEvens;
    }

// 9. Of given 5 numbers, how many are even or odd?:
    static int evenOrOddCount(int input1, int input2, int input3, int input4, int input5, String input6) {
        int countEvens = 0;
        if(input1 % 2 == 0){
            countEvens++;
        }
        if(input2 % 2 == 0){
            countEvens++;
        }
        if(input3 % 2 == 0){
            countEvens++;
        }
        if(input4 % 2 == 0){
            countEvens++;
        }
        if(input5 % 2 == 0){
            countEvens++;
        }
        if(input6.equals("even")){
            return countEvens;
        }
        return 5 - countEvens;
    }


}
