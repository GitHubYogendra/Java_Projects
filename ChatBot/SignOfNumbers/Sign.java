import java.util.Scanner;

public class Sign {

    public static int sign(int number) {
        return Integer.compare(number, 0);
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
