import java.util.*;
import java.lang.*;
import java.io.*;


class Atm
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            float balance = sc.nextFloat();
            float newBalance;

                    if (amount % 5 == 0 && amount < balance && amount + 0.5 <= balance) {
                        newBalance = (float) (balance - (amount + 0.50));
                        System.out.println(String.format("%.2f",newBalance));
                    }
                    else {
                        System.out.println(String.format("%.2f",balance));
                    }
                }
}

