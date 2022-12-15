import java.util.*;
public class count_set_bit{
	public static int bty(int n){
		int count=0;
		while(n>0){
			if((n&1 )!=0){
				count++;
			}
			n=n>>1;
		}
		return count;
	}
	public static void main(String args[]){
		// int n=10;
		System.out.println(bty(31));
	}
}