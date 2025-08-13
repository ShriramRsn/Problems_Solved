package OOPS.ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            // divide(a, b);
            String name = "sriram";
            if(name.equals("sriram")){
                throw new CustomException("Invalid name");
            }
        } catch (CustomException e) {
            System.out.print(e.getMessage());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    // throws means it to declared that this method may throws an exception
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Don't Divide by Zero");
        }
        return a/b;
    }
}
