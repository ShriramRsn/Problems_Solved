// 31. Problem to check whether all the numbers are arranged in ascending order
// Input1 = 4567
// Output: Yes
// Input2 = 4576
// Output: No
public class NumAscOrNot {
    public static void main(String[] args) {
        int input = 4567;
        if(numAscOrNot(input)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }   
    }

    static boolean numAscOrNot(int input){
        int temp = input % 10;
        input /= 10;
        while(input > 0){
            int digit = input % 10;
            
            if(temp < digit){
                return false;
            }
            input /= 10;
            temp = digit;
        }
        return true;
    }
}
