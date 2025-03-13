public class Patterns {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
    }
    static void pattern1(int n){
/*      
        * * * *
        * * * *
        * * * *
        * * * *                    
*/
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
/*      
        * 
        * * 
        * * * 
        * * * *                    
*/
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
/*      
        * * * *
        * * *
        * *
        *               
*/
        for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n-i+1; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
    static void pattern4(int n) {
/*      
                        1
                        1 2
                        1 2 3
                        1 2 3 4             
 */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
