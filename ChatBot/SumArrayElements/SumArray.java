
import java.util.Arrays;
import java.util.Scanner;

class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for (int i = 0;i < num;i++){
            if (n < array[i]) {
                sum = sum + array[i];
            }
        }
        System.out.println("\n" + sum);
    }
}
