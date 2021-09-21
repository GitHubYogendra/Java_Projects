/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Team
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		   Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i > 0) {
            int count = 0;
            int count1 = 0;
            int num = sc.nextInt();
            String s = sc.next();
             if(s.equals("0")||s.equals("1")) {
            String[] si = s.split("");
            if(si.length == num) {
                for (String co : si) {
                    if (co.equals("1")) {
                        count++;
                    }
                }
                String t = sc.next();
                 if(t.equals("0")||t.equals("1")) {
                String[] ti = t.split("");
                for (String co : ti) {
                    if (co.equals("1")) {
                        count1++;
                    }
                }
                if ((count == 1 && count1 == 1) || (count == 1 && count1 == 2) || (count == 2 && count1 == 1) || (count == 3 && count1 == 1) || (count == 1 && count1 == 3) ||
                        (count == 1 && count1 == 4) || (count == 4 && count1 == 1)) {
                    System.out.println("1");
                } else {
                    if (count == 4 && count1 == 4) {
                        System.out.println("4");
                    } else {
                        if ((count == 3 && count1 == 3) || (count == 4 && count1 == 3) || (count == 3 && count1 == 4)) {
                            System.out.println("3");
                        } else {
                            if ((count == 2 && count1 == 2) || (count == 2 && count1 == 3) || (count == 3 && count1 == 2) || (count == 2 && count1 == 4) || (count == 4 && count1 == 2)) {
                                System.out.println("2");
                            } else {
                                System.out.println("0");
                            }
                        }
                    }
                }
            }
            }
             }
            i--;
        }
	}
}

