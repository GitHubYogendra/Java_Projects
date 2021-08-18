package numbers;

import java.util.Scanner;

public class Gapful {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:");
        System.out.println("-enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;\n" +
                "  * the second parameters show how many consecutive numbers are to be processed;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
        System.out.println("Enter a request: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        if (str.length == 1) {
            if (s.isEmpty()) {
                first();
            } else
                try {
                    Long.parseLong(s);
                    long num = Long.parseLong(s);
                    if (num == 0) {
                        exit();
                    } else {
                        negative(num);
                        checkForNatural(num);
                        System.out.println("Properties of " + num);
                        checkFotBuzzNumber(num);
                        duckofnumb(num);
                        palindrome(num);
                        gapful(num);
                        checkForOddOrEven(num);
                        repeat();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    repeat();
                }
        } else {
            long num1 = Long.parseLong(String.valueOf(str[0]));
            long num2 = Long.parseLong(String.valueOf(str[1]));
            long num3 = num1 + num2;
            if (num1 < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
                repeat();
            } else {
                if (num2 <= 0) {
                    System.out.println("The second parameter should be a natural number.");
                    repeat();
                } else {
                    for (long i = num1; i < num3; i++) {
                        System.out.print(i + " is ");
                        checkFotBuzzNumber1(i);
                        duckofnumb1(i);
                        palindrome1(i);
                        gapful1(i);
                        checkForOddOrEven1(i);
                    }
                    repeat();
                }
            }
        }
    }


    private static void checkForOddOrEven1(long i) {
        if (i % 2 == 0) {
            System.out.print(" even, \n");
        }
        if (i % 2 != 0) {
            System.out.println("  Odd, ");
        }
    }

    private static void  duckofnumb1(long i) {
        int count = 0;
        while (i > 0) {
            long ld = i % 10;
            i = i / 10;
            if (ld == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.print("  duck, ");
        }
    }

    private static void palindrome1(long i) {
        long rev, sum = 0, temp;
        temp = i;
        while (i > 0) {
            rev = i % 10;
            sum = (sum * 10) + rev;
            i = i / 10;
        }
        if (temp == sum) {
            System.out.print("  palindromic, ");
        }
    }

    private static void gapful1(long i) {
        long rev, count = 0, temp = 0;
        long dup = i;
        rev = i % 10;
        while (i > 0) {
            temp = i % 10;
            count++;
            i /= 10;
        }
        if (count >= 3) {
            String res = temp + "" + rev;
            long result = Long.parseLong(res);
            if (dup % result == 0) {
                System.out.print(" gapful,");
            }
        }
    }

    private static void checkFotBuzzNumber1(long i) {
        long res = i % 10;
        if (i % 7 == 0 || res == 7) {
            System.out.print("  buzz,");
        }
    }

    private static void gapful(long num) {
        long rev, count = 0, temp = 0;
        long dup = num;
        rev = num % 10;
        while (num > 0) {
            temp = num % 10;
            count++;
            num /= 10;
        }
        if (count >= 3) {
            String res = temp + "" + rev;
            long result = Long.parseLong(res);
            boolean grape = (dup % result == 0);
            System.out.println("\t  gapful: " + grape);
        }
        System.out.println("\t  gapful:  false" );
    }


    private static void first() {
        System.out.println("Supported requests:");
        System.out.println("-enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("* the first parameter represents a starting number;\n" +
                "  * the second parameters show how many consecutive numbers are to be processed;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
        repeat();
    }

    private static void negative(long num) {
        if (num <= 0) {
            System.out.println("The first parameter should be a natural number or zero.");
            repeat();
        }
    }


    private static void palindrome(long num) {
        long rev, sum = 0, temp;
        temp = num;
        while (num > 0) {
            rev = num % 10;
            sum = (sum * 10) + rev;
            num = num / 10;
        }
        boolean pali = (temp == sum);
        System.out.println(" palindromic: " + pali);
    }

    private static void repeat() {
        System.out.println("Enter a request: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        if (str.length == 1) {
            if (s.isEmpty()) {
                first();
            } else
                try {
                    Long.parseLong(s);
                    long num = Long.parseLong(s);
                    if (num == 0) {
                        exit();
                    } else {
                        negative(num);
                        checkForNatural(num);
                        System.out.println("Properties of " + num);
                        checkFotBuzzNumber(num);
                        duckofnumb(num);
                        palindrome(num);
                        gapful(num);
                        checkForOddOrEven(num);
                        repeat();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    repeat();
            }
        } else {
            long num1 = Long.parseLong(String.valueOf(str[0]));
            long num2 = Long.parseLong(String.valueOf(str[1]));
            long num3 = num1 + num2;
            if (num1 < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
                repeat();
            } else {
                if (num2 <= 0) {
                    System.out.println("The second parameter should be a natural number.");
                    repeat();
                } else {
                    for (long i = num1; i < num3; i++) {
                        System.out.print(i + " is ");
                        checkFotBuzzNumber1(i);
                        duckofnumb1(i);
                        palindrome1(i);
                        gapful1(i);
                        checkForOddOrEven1(i);
                    }
                    repeat();
                }
            }
        }
    }

    private static void duckofnumb(long num) {
        int count = 0;
        while (num > 0) {
            long ld = num % 10;
            num = num / 10;
            if (ld == 0) {
                count++;
            }
        }
        boolean result = (count > 0);
            System.out.println("\t\tduck: " + result);
    }

    private static void checkFotBuzzNumber(long num) {
        long res = num % 10;
        boolean result = (num % 7 == 0 || res == 7);
            System.out.println("\t\tbuzz: " + result);
    }

    private static void checkForOddOrEven(long num) {
        boolean res = (num % 2 == 0);
        System.out.println("\t\teven: " + res);

        boolean result = (num % 2 != 0);
        System.out.println("\t\t Odd: " + result);
    }

    private static void checkForNatural(long num) {
        if (num <= 0) {
            exit();
        }
    }

    private static void exit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}

