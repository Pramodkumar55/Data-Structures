import java.util.*;
public class upper_case{
	public static String upper(String str){
		StringBuilder str1= new StringBuilder("");
		char st=Character.toUpperCase(str.charAt(0));
		str1.append(st);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i) == ' ' && i<str.length()-1){
				str1.append(str.charAt(i));
				i++;
				str1.append(Character.toUpperCase(str.charAt(i)));
			}
			else{
				str1.append(str.charAt(i));
			}
		}

		return str1.toString();
	}
	public static void main(String args[]){
		String str="hello wORLD ";
		System.out.println(upper(str));
	}
}