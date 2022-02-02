/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();
		while(t>0){
		    long n = sc.nextInt();
		    long ans;
		    if(n%2 == 0){
		        ans = n/2 + 1;
		    }else{
		        ans = (n+1)/2;
		    }
		    System.out.println(ans);
		    t--;
		}
	}
}
