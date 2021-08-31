import java.util.*;
import java.lang.*;
import java.io.*;


class Gcd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >= 1) {
            int n1, n2;
            int gcd, lcm, remainder, numerator, denominator;
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            if (n1 > n2) {
                numerator = n1;
                denominator = n2;
            } else {
                numerator = n2;
                denominator = n1;
            }
            remainder = numerator % denominator;
            while (remainder != 0) {
                numerator = denominator;
                denominator = remainder;
                remainder = numerator % denominator;
            }
            gcd = denominator;
            lcm = n1 * n2 / gcd;
            System.out.println(gcd+" "+lcm);
        }
	}
}
 
