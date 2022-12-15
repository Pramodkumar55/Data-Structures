// import java.util.*;
// public class anagram{
// 	public static void main(String args[]){
// 		String str1="earth";
// 		String str2="heart";
// 		str1=str1.toLowerCase();
// 		str2=str2.toLowerCase();
// 		if(str1.length() == str2.length()){
// 				char[] str1ary=str1.toCharArray();
// 				char[] str2ary=str2.toCharArray();
// 				Arrays.sort(str1ary);
// 				Arrays.sort(str2ary);
// 				boolean result=Arrays.equals(str1ary,str2ary);
// 				if(result){
// 					System.out.println("Anagram");
// 				}
// 				else{
// 					System.out.println("Not Anagram");
// 				}
// 			}
// 			else{
// 				System.out.println("Not Anagram");
// 			}
// 	}
// }



import java.util.*;
public class anagram{
	public static void main(String args[]){
		String str1="earth";
		String str2="heart";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length() == str2.length()){
				char[] str1ary=str1.toCharArray();
				char[] str2ary=str2.toCharArray();
				Arrays.sort(str1ary);
				Arrays.sort(str2ary);
				boolean result=Arrays.equals(str1ary,str2ary);
				System.out.println(result);
				if(result == true){
					System.out.println("Anagram");
				}
				else{
					System.out.println("Not Anagram");
				}
			}
			else{
				System.out.println("Not Anagram");
			}
	}
}