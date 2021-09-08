import java.util.Scanner;
// Remember that the class name should be "Main" and should be "public".
public class Input {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
	         Scanner sc = new Scanner(System.in);
        int i;
        int count = 0;
        int n = sc.nextInt();
        int b = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            if (i >= 0) {
                a[i] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            if (a[i] % b == 0) {
                count += 1;
            }
        }System.out.println(count);
    }
}


