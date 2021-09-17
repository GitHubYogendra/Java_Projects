import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Groos
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >= 1) {
            int basicSalary = sc.nextInt();
            if (basicSalary < 1500) {
                double Hra = basicSalary * 0.1;
                double da = basicSalary * 0.9;
                double gross = basicSalary + Hra + da;
                System.out.println(gross);
            } else {
            double da1 = basicSalary * 0.98;
            double gross1 = basicSalary + 500 + da1;
            System.out.println(gross1);
        }
        }
	}
}

