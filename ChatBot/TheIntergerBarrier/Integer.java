import java.util.Scanner;

class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = 0;

        while (number != 0) {
            if (number > 0) {
                max += number;
                if (max >= 1000) {
                    load(max);
                }
            }
                number = scanner.nextInt();
        }
        System.out.println("\n"+max);
    }

    public static void load(int max) {
        int sub = 0;
        if (max >= 1000) {
            sub = max - 1000;
        }
        System.out.println("\n"+ sub);
        System.exit(0);
    }
}

