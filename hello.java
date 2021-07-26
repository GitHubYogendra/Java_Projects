import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, yogi!\n hello github");
        System.out.println("tell the number to count");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i + "!");
        }

        sc.close();
    }
}
