import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Turbo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr= new int[t];
		for(int i = 0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
		
	}
}

