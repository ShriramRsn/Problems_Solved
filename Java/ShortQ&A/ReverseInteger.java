//7.Reverse Integer
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(integerReverse(-123));
    }

    static int integerReverse(int x){
        int rev = 0;
        while(x != 0){
            int rem = x % 10;
            if(rev > Integer.MAX_VALUE || rev == Integer.MAX_VALUE && rem < 7){
                return 0;
            }
            if(rev < Integer.MIN_VALUE || rev == Integer.MIN_VALUE && rev > -8){
                return 0;
            }
            rev = rev*10 + rem;
            x /= 10;
        }
        return rev;
    }
}
