public class DecimalPointSum {
    public static void main(String[] args) {
        double num = 12.257;
        String str = Double.toString(num);

        int dotIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                dotIndex = i;
                break;
            }
        }

        int decimalPartInt = 0;

        for (int i = dotIndex + 1; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            decimalPartInt = decimalPartInt * 10 + digit;
        }

        int sum = 0;
        while(decimalPartInt != 0){
            int rem = decimalPartInt % 10;
            sum =  sum + rem;
            decimalPartInt /= 10;
        }

        System.out.println(sum);
        
    }
}

