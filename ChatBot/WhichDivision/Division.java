
import java.util.*;
import java.lang.*;
import java.io.*;

class Division
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if ((i >= 1) && (i <= 1000)) {
            while (i > 0) {
                int num = sc.nextInt();
                if ((num >= 1000) && (num <= 4500)) {
                    if (num >= 2000) {
                        System.out.println("1");
                    } else {
                        if ((num >= 1600) && (num < 2000)) {
                            System.out.println("2");
                        } else {
                            System.out.println("3");
                        }
                    }
                }
                i--;
            }

        }
	}
}

