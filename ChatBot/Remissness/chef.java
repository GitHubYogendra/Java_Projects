import java.util.*;
import java.lang.*;
import java.io.*;
class chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >= 1) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                int res = (a +b);
                System.out.println(b + " " + res);
            } else if (a > b) {
                int res1 = (a +b);
                System.out.println(a + " " + res1);
            }
        }
	}
}

