public class SumOfDigit {
    public static void main (String[] args){
        System.out.println(sumOfDigit(12345));
        int a = sumOfDigitSub(6972);
        int b = sumOfDigitOfThree(345);
        int c = sumOfDigitOfThree(567);
        System.out.print(a);
    }
    
    static int sumOfDigit(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum =  sum + rem;
            n /= 10;
        }
        n = sum;
        sum = n % 10 + n / 10;
        return sum;
    }

    static int sumOfDigitOfThree(int n){
        int rem = 0, min = 0,max = 0;
        while(n != 0){
            rem = n % 10;
            if(rem > max){
                max = rem;
            } min = rem;
            if(rem < min){
                min = rem;
            }
            n /= 10;
        }
        return min+max;
    }

    static int sumOfDigitSub(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum =  sum - rem;
            n /= 10;
        }
        n = sum;
        sum = n % 10 - n / 10;
        return sum;
    }
}
