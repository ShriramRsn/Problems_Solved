import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial: " + fact(n));
        System.out.println("Fibonacci: " + fibonacci(n));
    }

    //factorial
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    //fibonacci
    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n - 2);
    }
}
