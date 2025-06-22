public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        patternthirteen(n);
    }

        // 1 1 1 1 1 
        // 2       5
        // 3       5
        // 4       5
        // 1 1 1 1 1
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

        // 1 
        // 0 0
        // 1 1 1
        // 0 0 0 0
        // 1 1 1 1 1
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

        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
    static void patternThree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

        // 12345
        // 1234
        // 123
        // 12
        // 1
    static void patternFour(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

        // E D C B A 
        // A B C D
        // D C B
        // B C
        // C
    static void patternFive(int n) {
        char start = (char) ('A' + n - 1); // Start from 'E' for n = 5

        for (int i = 0; i < n; i++) {
            int len = n - i;

            if (i % 2 == 0) {
                for (int j = 0; j < len; j++) {
                    System.out.print((char)(start - j) + " ");
                }
                start = (char)(start - len + 1);
            } else {
                for (int j = 0; j < len; j++) {
                    System.out.print((char)(start + j) + " ");
                }
                start = (char)(start + len - 1);
            }
            System.out.println();
        }
    }

        //     1
        //    12
        //   123
        //  1234
        // 12345

    static void patternSix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

        // 12345
        //  2345
        //   345
        //    45
        //     5
    static void patternSeven(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

        // 12345
        // 2345
        // 345
        // 45
        // 5
    static void patternEight(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

        // 5 4 3 2 1 
        // 4 3 2 1
        // 3 2 1
        // 2 1
        // 1
    static void patternNine(int n) {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

        // 1
        // 10
        // 101
        // 1010
        // 10101
    static void patternTen(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2);
            }
            System.out.println();
        }
    }

        //     *
        //    ***
        //   *****
        //  *******
        // *********
    static void patternEleven(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *
    static void patternTwelve(int n){
        // Upper pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }

        // Lower inverted pyramid
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }
    }

        // * * * * * 
        //  * * * * 
        //   * * * 
        //    * * 
        //     * 
        //    * * 
        //   * * * 
        //  * * * *
        // * * * * *
    static void patternthirteen(int n) {
        // Upper half (inverted pyramid)
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++)
                System.out.print(" ");
            for (int j = 0; j < n - i; j++)
                System.out.print("* ");
            System.out.println();
        }
        // Lower half (regular pyramid)
        for (int i = 1; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

    }

}
