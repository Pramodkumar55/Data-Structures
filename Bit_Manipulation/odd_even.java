import java.util.*;
public class odd_even{
	public static void odev(int n){
		int bitMask=1;
		if((n &bitMask)==1){
			System.out.println("odd");
		}
		else{
			System.out.println("even");	
		}
	}
	public static void main(String args[]){
		int n=52;
		odev(n);

	}
}