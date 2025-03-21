public class Patterns {
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        pattern6(5);
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

    static void pattern5(int n){
        // * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * *
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i==0||i==n-1||j==0||j==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i == j || i + j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i = 1; i <=n; i++){
            for(int j=1; j <=n; j++){
                if((i == 1 && j == 3) || (i == 2 && (j == 2 || j == 4)) || i == 3 || (i == 4 && (j == 1 || j == 5)) || (i == 5 && (j == 1 || j == 5))){
                    System.out.print("A ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
