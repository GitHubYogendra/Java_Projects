import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        long end = sc.nextInt();
        long product = 1;
        for (long i = start; i < end; i++) {
            product *= i;
        }
        System.out.println(product);
	sc.close();
    }
}

