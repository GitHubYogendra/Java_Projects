package numbers;

import java.util.Scanner;

public class Amazing {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a natural number:");
        int num = sc.nextInt();
        checkForNatural(num);
        checkForOddOrEven(num);
        checkFotBuzzNumber(num);
        explanation(num);

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
            System.out.println("It is a Buzz number.");
        } else {
            System.out.println("It is not a Buzz number.");
        }
    }

    private static void checkForOddOrEven(int num) {
        if(num % 2 == 0){
            System.out.println("This number is Even.");
        } else {
            System.out.println("This number is Odd.");
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

