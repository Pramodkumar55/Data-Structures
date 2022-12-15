import java.util.*;
public class Prog2{
	
	public static boolean iseven(int n){
		boolean evenn=true;
		if(n%2!=0){
		evenn= false;
		

		}
		return evenn;
		// (evenn);
	}
	public static void main(String args[]){
		System.out.println(iseven(5));
	}
}