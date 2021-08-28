import java.util.*;
import java.lang.*;
import java.io.*;

class Total
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >= 1) {
            double quantity = sc.nextDouble();
            double price = sc.nextDouble();
            double display = 0;
            double total = 0;
            if(quantity >= 1000){
                total = quantity * price;
                double total1 = total*0.1;
                display = total - total1;
                System.out.println(display+"00000");
            }else {
                total = (quantity * price);
                System.out.println(total+"00000");
            }
            }
	}
}

