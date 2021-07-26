import java.util.Scanner;

class ReverseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = -1;
        System.out.println( a++);
        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);
        int num = scanner.nextInt();
        int last = num % 10;
        int middle = (num % 100) / 10;
        int first = (num % 1000) / 100;
        if(last != 0) {
            System.out.print(last + "" + middle + "" + first);
        } else {
            System.out.print(middle + "" + first);
        }scanner.close();
    }
}
