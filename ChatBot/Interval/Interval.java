import java.util.Scanner;

class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (num > -15 && num <= 1000000 && num != 13 && num != 14 && num != 17 && num != 18 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
