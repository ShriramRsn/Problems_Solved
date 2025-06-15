public class Factorial {
    public static void main(String[] args) {
        int input1 = 5;
        System.out.println(factorialOf(input1));
        System.out.println(nThFibonacci(input1));
    }

// 11. Factorial of a number: 
    static int factorialOf(int input1){
        if(input1 <= 1){
            return 1;
        }
        return input1*factorialOf(input1 - 1);
    }

// 12. Nth Fibonacci: 
    static int nThFibonacci(int input1){
        if(input1 <= 1){
            return 1;
        }
        return nThFibonacci(input1 - 1) + nThFibonacci(input1 - 2);
    }
}
