import java.util.*;
import java.lang.*;
import java.io.*;

class Lead
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int i = 0;
            int a = num.nextInt();
            int[] player1 = new int[]{a};
            int b = num.nextInt();
            int[] player2 = new int[]{b};
            int max = player1[0];
            int index = 0;
            for (i = 0; i < player1.length; i++) {
                if (max < player1[i]) {
                    max = player1[i];
                    index = i;
                }
            }
            int store = index;
            if (player1[store] > player2[store]) {
                int[] res = {player1[store] - player2[store]};
                int size = res.length;
                Arrays.sort(res);
                System.out.println("\n 1 " + res[size - 1]);
            } else if (player1[store] < player2[store]) {
                int[] res1 = {player2[store] - player1[store]};
                int size = res1.length;
                Arrays.sort(res1);
                System.out.println("\n 2 " + res1[size - 1]);
            }
	}
}
