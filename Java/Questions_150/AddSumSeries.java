public class AddSumSeries{
    public static void main(String[] args){
        int n = 6;
        int opt = 2;
        System.out.println(addSub(n,opt));
    }

    static int addSub(int input1,int input2){
        int sum = input1;
        boolean isPlus;
        if(input2 == 2){
            isPlus = true;
        }
        else{
            isPlus = false;
        }

        for(int i = input1 - 1; i >= 1; i--){
            if(isPlus){
                sum += i;
                isPlus = false;
            }
            else{
                sum -= i;
                isPlus = true;
            }
        }

        return sum;
    }
}