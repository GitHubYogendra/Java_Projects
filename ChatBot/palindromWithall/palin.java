package numbers;

import java.util.Scanner;

public class palin {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:");
        System.out.println("-enter a natural number to know its properties; \n-enter 0 to exit.");
        System.out.println("Enter a request: ");
        long num = sc.nextLong();
            if (num == 0) {
                exit();
            } else {
                negative(num);
                checkForNatural(num);
                System.out.println("Properties of " + num);
                checkForOddOrEven(num);
                checkFotBuzzNumber(num);
                duckofnumb(num);
                palindrome(num);
                repeat();
            }
        }

    private static void negative(long num) {
        if (num <= 0){
            System.out.println("The first parameter should be a natural number or zero.");
            repeat();
        }
    }


    private static void palindrome ( long num){
            long rev, sum = 0, temp;
            temp = num;
            while (num > 0) {
                rev = num % 10;
                sum = (sum * 10) + rev;
                num = num / 10;
            }
            if (temp == sum) {
                System.out.println("\tpalindromic: true ");
            } else {
                System.out.println("\tpalindromic: false");
            }
            repeat();
        }

    private static void repeat() {
        System.out.println("Enter a request: ");
        long num = sc.nextLong();
        if (num == 0) {
            exit();
        } else {
            negative(num);
            checkForNatural(num);
            System.out.println("Properties of " + num);
            checkForOddOrEven(num);
            checkFotBuzzNumber(num);
            duckofnumb(num);
            palindrome(num);
        }
    }

    private static void duckofnumb ( long num){
            int count = 0;
            while (num > 0) {
                long ld = num % 10;
                num = num / 10;
                if (ld == 0) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("\t\tduck:  true");
            } else {
                System.out.println("\t\tduck:  false");
            }
        }

        private static void checkFotBuzzNumber ( long num){
            long res = num % 10;
            if (num % 7 == 0 || res == 7) {
                System.out.println("\t\tbuzz:  true");
            } else {
                System.out.println("\t\tbuzz:  false");
            }
        }

        private static void checkForOddOrEven ( long num){
            if (num % 2 == 0) {
                System.out.println("\t\teven:  true");
            } else {
                System.out.println("\t\teven:  false");
            }
            if (num % 2 != 0) {
                System.out.println("\t\tOdd:  true");
            } else {
                System.out.println("\t\tOdd:  false");
            }
        }

        private static void checkForNatural ( long num){
            if (num <= 0) {
                exit();
                // System.out.println("This number is not natural!");
            }
        }
        private static void exit () {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

