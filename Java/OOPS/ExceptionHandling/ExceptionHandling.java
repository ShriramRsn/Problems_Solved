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

/*  Try Block:
 *      Code that potentially throw an exception
 *  Catch Block:
 *      Each catch block specifies the type of exception it can handle
 *  throw:
 *      This Keyword is used to explicitly throw an exception
 *  throws:
 *      This keyword is used in a method signature to declare that 
 *      the method might throw one or more specified types of exceptions.
 */