import java.util.Scanner;

class SumOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = 0;

        while (number != 0) {
            if (number > 0) {
                max += number;
            }
            number = scanner.nextInt();
        }

        System.out.println(max);
    }
}
