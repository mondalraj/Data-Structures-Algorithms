import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		String ans = "";
		ans += str.charAt(0);
		for(int i=1; i<str.length(); i++){
			int ascii = str.charAt(i) - str.charAt(i-1);
			ans+=ascii;
			ans+=str.charAt(i);
		}

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}