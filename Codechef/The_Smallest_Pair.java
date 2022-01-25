/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Problem link -> https://www.codechef.com/problems/SMPAIR

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    int small1 = arr[0];
		    int small2 = arr[1];
		    
		    int sum = small1 + small2;
		    System.out.println(sum);
		    
		    t--;
		}
	}
}
