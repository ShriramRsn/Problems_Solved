public class LastDigitOf {
    public static void main(String[] args) {
        int input1 = 197;
        int input2 = 154;
        System.out.println(lastDigitOf(input1));
        System.out.println(secondLastDigitOf(input1));
        System.out.println(addLastDigits(input1,input2));
        System.out.println(isMultiple(input1,input2));
    }

// 3. Return last digit of the given number :
    static int lastDigitOf(int input){
        input = Math.abs(input);
        return input%10;
    }

// 4. Return second last digit of given number  : 
    static int secondLastDigitOf(int input){
        input = Math.abs(input);
        if(input > 10){
            input = input % 100;
            return input/10;
        }
        return -1;
    }

// 5. Sum of last digit of two given numbers  : 
    static int addLastDigits(int input1, int input2){
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);
        return input1 % 10 + input2 % 10;
    }

// 6. Is N an exact multiple of M?:
    static int isMultiple(int input1, int input2){
        int val = 0;
        if(input1 == 0 || input2 == 0){
            val = 0;
        }
        else if( (input1 % input2) != 0){
            val = 1;
        }
        else{
            val = 2;
        }
        return val;
    }


}
