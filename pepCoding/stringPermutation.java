import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){

		int perm = calFactorial(str.length());

		for(int i = 0; i<perm; i++){

			StringBuilder orgStr = new StringBuilder(str);
			int temp = i;

			for(int j=str.length(); j>=1; j--){
				int q = temp/j;
				int r = temp%j;
				System.out.print(orgStr.charAt(r));
        		orgStr.deleteCharAt(r);
        		temp = q;
			}
			System.out.println();
		}
		
	}

	public static int calFactorial(int num){
		int fact = 1;
		while(num>1){
			fact=fact*num;
			num--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}