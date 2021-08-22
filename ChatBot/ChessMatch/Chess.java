import java.util.*;
import java.lang.*;
import java.io.*;

class Chess
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
          if (t >= 1 && t <= 100000) {
        while (t-- >= 1) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (n >= 10 && n <= 100 && a>=0&&a <= ((180+2)*((n+1)/2))&&b<= ((180+2)*((n+1)/2))) {
                int res = 2 * (180 + n);
                int sum = a + b;
                int diff = res - sum;
                System.out.println(diff);
            }
        }
	}
}
}

