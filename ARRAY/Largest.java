import java.util.*;
public class Largest{
	public static int larsrc(int num[]){
		// int largest=-0;
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++){
			if(num[i]>largest){
				largest=num[i];
			}
			if(num[i]<smallest){
				smallest=num[i];
			System.out.println("The smallest value is "+smallest);
			}
		}
		return largest;
	}
	public static void main(String args[]){
		int num[]={1,5,4,2,3,6,9,8,85};
		System.out.println("the largest value of the array is "+larsrc(num));
	}
}