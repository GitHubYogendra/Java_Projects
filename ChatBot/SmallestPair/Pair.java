import java.util.*;
import java.lang.*;
import java.io.*;

class Pair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >= 1) {
            int sample = sc.nextInt();
            int[] arr = new int[sample];
            for (int j = 0; j < sample; j++) {
                arr[j] = sc.nextInt();
            }
                Arrays.sort(arr);
                int a = arr[0];
                int b = arr[1];
                int sum = a + b;
                System.out.println(sum);
            }
	}
}
