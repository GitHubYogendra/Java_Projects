package numbers;

import java.util.Scanner;

public class DuckNumber {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a natural number:");
        int num = sc.nextInt();
        checkForNatural(num);
        System.out.println("Properties of "+num);
        checkForOddOrEven(num);
        checkFotBuzzNumber(num);
       // explanation(num);
        duckofnumb(num);

    }

    private static void duckofnumb(int num) {
        int count = 0;
        while (num > 0) {
            int ld = num % 10;
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


        private static void explanation(int num) {
        System.out.println("Explanation:");
        int rum = num % 10;
        if (num % 7 == 0 && rum == 7) {
            System.out.println(num + " is divisible by 7 and ends with 7.");
        }
        if (num % 7 == 0 && rum != 7) {
            System.out.println(num + " is divisible by 7. ");
        }
        if (num % 7 != 0 && rum == 7) {
            System.out.println(num + " ends with 7.");
        }
        if (num % 7 != 0 && rum != 7){
            System.out.println(num+" is neither divisible by 7 nor does it end with 7.");
        }
    }


    private static void checkFotBuzzNumber(int num) {
        int res = num % 10;
        if (num % 7 == 0 || res == 7){
            System.out.println("\t\tbuzz:  true");
        } else {
            System.out.println("\t\tbuzz:  false");
        }
    }

    private static void checkForOddOrEven(int num) {
        if(num % 2 == 0){
            System.out.println("\t\teven:  true");
        } else {
            System.out.println("\t\teven:  false");
        }
        if(num % 2 != 0){
            System.out.println("\t\tOdd:  true");
        } else {
            System.out.println("\t\tOdd:  false");
        }
    }

    private static void checkForNatural(int num) {
        if(num <= 0){
            exit();
           // System.out.println("This number is not natural!");
        }
    }
    private static void exit(){
        System.out.println("This number is not natural!");
        System.exit(0);
    }
}

