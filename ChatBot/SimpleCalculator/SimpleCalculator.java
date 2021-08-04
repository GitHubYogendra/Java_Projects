import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        String op = scanner.next();
        long b = scanner.nextInt();
        switch (op) {
            case "+":
                sumTwoNumbers(a, b);
                break;
            case "-":
                subtractTwoNumbers(a, b);
                break;
            case "*":
                multiplyTwoNumbers(a, b);
                break;
            case "/":
                divideTwoNumbers(a, b);
            default:
                System.exit(0);
        }

    }

    public static void divideTwoNumbers(long a, long b) {
        if (b == 0 || a == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(a / b);
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }

    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a - b);
    }

    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }
}
