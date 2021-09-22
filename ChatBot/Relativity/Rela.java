import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Rela
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 5000) {
            while (t-- >= 1) {
                int gravity = sc.nextInt();
                int e = sc.nextInt();
                if (gravity >= 1 && gravity <= 10 && e >= 1000 && e <= 3000) {
                    int grav1 = (2 * gravity);
                    int e1 = (e * e);
                    int res = e1 / grav1;
                    System.out.println(res);
                }
            }
        }
	}
}
 
