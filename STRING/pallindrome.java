// import java.util.*;
// public class pallindrome{
// 	public static void str(String str1){
// 		String str2="";
// 		for(int i=str1.length()-1;i>=0;i--){
// 			str2=str2+str1.charAt(i);

// 		// for(int i=0;i<str1.length();i++){
// 			// str2=str1.charAt(i)+str2;

// 		}	
// 		System.out.println(str2);
// 		// if(str2.compareTo(str1) == 0){
// 		if(str2.compareTo(str1) == 0){
// 			System.out.println("pallindrome");
// 		}
// 		else{
// 			System.out.println("not");
// 		}
// 	}
// 	public static void main(String args[]){
// 		String str1="dad";
// 		str(str1);
// 	}
// }

import java.util.*;
public class pallindrome{
	// int n=str1.length();
	public static boolean str(String str1){
		int n=str1.length();
		for(int i=0;i<n/2;i++){
			if(str1.charAt(i)!=str1.charAt(n-1-i)){
				System.out.println("Not a pallindrome  ");
				return false;
			}
		}
		System.out.println("pallindrome");
		return true;
		
	}
	public static void main(String args[]){
		String str1="MotoM";
		str(str1);
	}
}
