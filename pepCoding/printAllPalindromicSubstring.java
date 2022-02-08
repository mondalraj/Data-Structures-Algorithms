import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		for(int i=0;i<str.length(); i++){
			for(int j=i+1; j<=str.length();j++){
				String subString = str.substring(i,j);
				for(int k=0, l=subString.length()-1; k<=l;k++,l--){
					
					if(subString.charAt(k) != subString.charAt(l)){
						break;
					}
					if((k+1)==l || k==l){
						System.out.println(subString);
					}
				}	
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}