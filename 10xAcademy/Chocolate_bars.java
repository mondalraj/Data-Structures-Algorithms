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
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int pairCount = 0;
		
		for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		int[] Xvalue = new int[n];
		for(int i=0; i<n;i++){
		    int x = 1;
		    for(int j=2; j<=arr[i]; j++){
		        if(arr[i] % j == 0 ){
		            x++;
		        }
		    }
		    Xvalue[i] = x;
		}
		for(int i=0; i<Xvalue.length; i++){
		    if(Xvalue[i] > 0){
		        int count = 1;
		        for(int j = i+1; j<Xvalue.length; j++){
		            if(Xvalue[i] == Xvalue[j]){
		                Xvalue[j] = 0;
		                count++;
		            }
		        }
		        pairCount = pairCount + (count*(count-1)/2);
		    }
		}
		System.out.println(pairCount);
	}
}
