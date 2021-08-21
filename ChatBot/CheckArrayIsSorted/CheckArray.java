
import java.util.Arrays;
import java.util.Scanner;

class CheckArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ch1 = null, ch;
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        ch = Arrays.toString(array);
        for (int i = 0; i < num; i++) {
            Arrays.sort(array);
            ch1 = Arrays.toString(array);
        }
        boolean cp = (ch.equals(ch1));
            System.out.println(cp);
    }
}
