import java.util.*;
public class sub_string{
	public static String sub_string(String str,int strt_indx,int end_indx){
		String sub_string="";
		for(int i=strt_indx;i<end_indx;i++){
			sub_string+=str.charAt(i);
		}
		return sub_string;
	}
	public static void main(String args[]){
		String str="Hello World";
		System.out.println(sub_string(str,0,5));
	}
}



// java defined function

import java.util.*;
public class sub_string{
	public static void main(String args[]){
		String str="Hello World";
		String str1=str.substring(0,5);
		System.out.println(str1);
	}
}