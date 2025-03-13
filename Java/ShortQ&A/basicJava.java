import java.util.Scanner;
public class basicJava {
    public static void main(String[] args){

        // System.out.println(isLeapYear() + "\n");
        // System.out.println("Sum: " + sum() + "\n");
        // System.out.println("Multiply of: \n" + multiply() + "\n");
        // System.out.println("HCF: " + HCFLCM() + "\n");
        // System.out.println("Sum: " + sumOfN() + "\n");
        // System.out.println("Factorial: " + fact() + "\n");
        // System.out.println("CountDigits:" + countDigits());
        // System.out.println("Alphabets: "+ alphabets());
        // System.out.println("Palindrome: "+ palindrome());
        // System.out.println("Even: "+ isEven());
        // System.out.println("Odd: "+ isOdd());
        // System.out.println("Unique Value: " + unique());
        System.out.println("Mask Bitwise: " + bitWise());
        // System.out.println("Zero Count: "+ zeroCount());
    }

    //Leap Year or Not (LYORNOT)
    static String isLeapYear(){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
             return "It's a leap year";
        }
        
        return "It's not a leap year";
    }

    //Sum of two number
    static int sum(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        return a+b;
    }

    //multiplication
    static String multiply(){
        Scanner input =  new Scanner(System.in);
        StringBuilder string = new StringBuilder();
        int num = input.nextInt();
        for(int i=1; i <= 10; i++){
            string.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
        }
        return string.toString();
    }

    //HCF and LCM
    static int HCFLCM(){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int hcf = 1;
        int min = Math.min(x, y);
        for (int i = 1; i <= min; i++) {
            if (x % i == 0 && y % i == 0) {
                hcf = i;
            }
        }
        int lcm = (x*y)/hcf;
        return hcf;
    }

    //Sum of n 
    static int sumOfN(){
        Scanner input =  new Scanner(System.in);
        StringBuilder string = new StringBuilder();
        int num ;
        int total = 0;
        while(true){
            if (input.hasNextInt()) {
                num = input.nextInt();
                total += num;
            }
            else if(input.next().equals("x")){
                break;
            }
            else{
                System.out.println("You provided invalid symbol");
                continue;
            }
        }
        return total;
    }

    //Factorial
    static int fact(){
        Scanner input =  new Scanner(System.in);
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = i*fact;
        }
        return fact;
    }

    //Count
    static int countDigits(){
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while(0<a){
            a/=10;
            count++;
        }
        return count;
    }

    //Print all alphabets O(N^2) & O(N)
    static StringBuilder alphabets(){
        // String Alphabets = " ";
        // for(int i = 0; i < 26; i++){
        //     char ch = (char)('a'+ i);
        //     Alphabets += " " + ch;
        // }
        StringBuilder Alphabets = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            Alphabets.append(ch).append(" ");
        }
        return Alphabets;
    }

    //PORNOT
    static Boolean palindrome(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toLowerCase();
        if(str == null || str.length() == 0){
            return true;
        }
        for(int i = 0; i < str.length(); i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);
            if(start != end){
                return false;
            }
        }
        return true;
    }

    //even or odd without %
    static boolean  isEven(){
        Scanner sc =  new Scanner(System.in);
        int number = sc.nextInt();
        Math.abs(number);
        boolean TorF = true;
        for(int i = 1; i <= number; i++){
            TorF = !TorF;
        }
        return TorF;
    }

    //Even or Odd using bitwise
    static boolean isOdd(){
        Scanner sc =  new Scanner(System.in);
        int number = sc.nextInt();
        Math.abs(number);
        return (number & 1) == 1;
    }

    static int unique(){
        int[] arr = {2, 3, 4, 3, 2, 4, 1};
        int unique = 0;
        for(int i : arr){
            unique ^= i;
        }
        return unique;
    }

    static int bitWise(){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        return n | (1 << (n-1));
    }
    
    // number of Zero's
    static int zeroCount(){
    Scanner sc = new Scanner(System.in);
    String numberStr = sc.next();

    int count = 0;
    for (int i = 0; i < numberStr.length(); i++) {
        if (numberStr.charAt(i) == '0') {
            count++;
        }
    }
    return count;
    }
}
/* Formula for calculating size of the datatype:
        -2^n-1 to (2^n-1 - 1)
 */