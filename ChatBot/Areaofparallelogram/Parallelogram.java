import java.util.Scanner;

public class parallelogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        countAreaOfParallelogram(base,height);
    }

    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
