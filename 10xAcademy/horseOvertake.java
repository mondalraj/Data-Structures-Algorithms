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
		int[][] arr = new int[n][2];
		for(int i=0;i<n;i++){
		    arr[i][0] = sc.nextInt();
		    arr[i][1] = sc.nextInt();
		}
		int overtakeCount = 0;
		for(int i=0; i<n;i++){
	        for(int j=0;j<n;j++){
        		if(i==j){
        			continue;
        		}
        		if(arr[i][0]<arr[j][0] && arr[i][1]>arr[j][1]){
        			overtakeCount++;
        		}
	        }
        }
        System.out.println(overtakeCount);
 	}
}
