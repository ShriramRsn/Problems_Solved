
public class IsPrime {
    public static void main(String[] args) {
        int input1 = 2;
        int input2 = 20;
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int len = 10;
        System.out.println(sumOfNonPrimeIndexValues(arr, len));
        System.out.println(isPrime(input1));
        System.out.println(nThPrime(input1));
        System.out.println(noPrimeInRange(input1,input2));
    }

// 10. Is Prime?:
    static int isPrime(int input1){
        if(input1 <= 1){
            return 1;
        }
        int c = 2;
        while(c*c <= input1){
            if(input1 % c == 0){
                return 1;
            }
            c+=1;
        }
        return 2;
    }

// 13. Nth Prime: 
    static int nThPrime(int input1){
        int count = 0;
        int num = 1;
        while(count < input1){
            num++;
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        return num;
    }

// 14. Number of Primes in a specified range:
    static int noPrimeInRange(int input1,int input2){
        int count = 0;
        int num = input1;
        while(num <= input2){
            num++;
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        return count;
    }

    static int sumOfNonPrimeIndexValues(int[] input1, int input2){
        int c = 2;
        int i = 0;
        int sum = 0;
        while( i < input2){
            while(c * c <= input1[i]){
                if(input1[i] % c == 0){
                    sum += input1[i];
                }
                c++;
            }
            i++;
        }
        return sum;
    }
}
