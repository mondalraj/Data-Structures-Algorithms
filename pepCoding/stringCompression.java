import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String newString = "";
		char currentChar = str.charAt(0);
		newString += currentChar;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i) == currentChar){
				continue;
			} else{
				currentChar = str.charAt(i);
				newString += currentChar;
			}
		}

		return newString;
	}

	public static String compression2(String str){
		String newString = "";
		char currentChar = str.charAt(0);
		newString += currentChar;
		int currentCharCount = 1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i) == currentChar){
				currentCharCount++;
			} else{
			    if(currentCharCount != 1)
				    newString += currentCharCount;
				currentCharCount = 1;
				currentChar = str.charAt(i);
				newString += currentChar;
			}
		}
		if(currentCharCount != 1)
			newString += currentCharCount;

		return newString;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}