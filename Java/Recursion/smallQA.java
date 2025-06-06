package Recursion;
import java.util.Scanner;

public class smallQA {
    
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("Factorial: " + fact(n));
        // System.out.println("Fibonacci: " + fibonacci(n));
        // Nnumber(n);
        // System.out.println(sumOfDigit(n));
        revDigit(n);
        System.out.println(sum);
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

    static void Nnumber(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Nnumber(n-1);
        System.out.println(n);
    }
    //1:19 full charge on laptop 15-100
    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }
        return sumOfDigit(n / 10) + (n % 10);
    }

    static void revDigit(int n){
        if(n == 0){
            return ;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        revDigit(n/10);
    }
    
}
