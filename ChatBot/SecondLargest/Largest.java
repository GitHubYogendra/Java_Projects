import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Largest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->=1){
            int[] arr = new int[3];
            for(int i=0;i<3;i++){
                arr[i] = sc.nextInt();
            }
            int size = arr.length;
            Arrays.sort(arr);
            System.out.println(arr[size-2]);
            }
	}
}

