
import java.util.*;
import java.lang.*;
import java.io.*;

class Maha
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ready = 0;
        int notready = 0;
        while (n-- >= 1) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                ready++;
            } else {
                notready++;
            }
        }
        if (ready > notready) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
	}
}

