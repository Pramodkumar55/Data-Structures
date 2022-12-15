import java.util.*;
public class decending{
	public static void dec(int n){
		if(n == 0){
			return ;
		}
		System.out.print(n +" ");
		dec(n-1);
	}
	public static void main(String args[]){
	int n=5;
	dec(n);
	}
}