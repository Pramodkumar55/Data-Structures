import java.util.*;
public class check_2_power{
	public static boolean bty(int n){
		// int bitMask=a | b;
		return (n & (n-1))==0;
	}
	public static void main(String args[]){
		// int n=10;
		System.out.println(bty(8));
	}
}