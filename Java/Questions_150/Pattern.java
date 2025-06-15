public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        patternOne(n);
        System.out.println("\n");
        patternFour(n);
    }

    static void patternOne(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("1 ");
        }
        System.out.println();
        for (int i = 2; i < n; i++) {
            System.out.print(i);

            for (int j = 0; j < (n - 1) * 2 - 1; j++) {
                System.out.print(" ");
            }

            System.out.println("5");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("1 ");
        }
    }

    static void patternTwo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void patternThree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patternFour(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
