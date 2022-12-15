// import java.util.*;
// public class larggest_string{
// 	public static void main(String args[]){
// 		String str1="HelloabcD";
// 		String str2="Helloabcd";
// 		if(str1.compareTo(str2) == 0){
// 			System.out.println("Strings are equal");
// 		}
// 		else if(str1.compareTo(str2) > 0){
// 			System.out.println("Str1 is greater");
// 		}
// 		else{
// 			System.out.println("Str2 is greater");
// 		}
// 	}
// }



import java.util.*;
public class larggest_string{
	public static void main(String args[]){
		String fruit[]={"mango","apple","pine apple","orange"};
		String greatest=fruit[0];
		for(int i=0;i<fruit.length;i++){
			if(fruit[i].compareTo(greatest)>0){
				greatest=fruit[i];
			}
		}
		System.out.println(greatest);
	}
}