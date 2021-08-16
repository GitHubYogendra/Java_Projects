import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i, fact = 1;
        long num = sc.nextLong();
        for (i = 1; i < num; i++) {
            fact = fact * i;
            if (fact > num) {
                break;
            }
        } System.out.println(i);
    }
}
