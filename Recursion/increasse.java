import java.util.*;
public class increasse{
	public static void asc(int n){
		if(n == 0){
			return ;
		}
		asc(n-1);
		System.out.print(n +" ");
		
	}
	public static void main(String args[]){
	int n=5;
	asc(n);
	}
}