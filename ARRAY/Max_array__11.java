import java.util.*;
public class Max_array__11{
	public static void arr(int num[]){
		int ms=Integer.MIN_VALUE;
		int currsum=0;
		int prefix[]=new int[num.length];
		prefix[0]=num[0];
		for(int i=1;i<num.length;i++){
			prefix[i]=prefix[i-1]+num[i];
		}
		for(int i=0;i<num.length;i++){
			for(int j=i;j<num.length;j++){
				
				currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
				if(currsum>ms){
					ms=currsum;
				}
			}
				// sum=0;
		}
			System.out.println();
		System.out.println("The max sum is :: "+ms);
	}	
	public static void main(String args[]){
		int num[]={1,-2,6,-1,3};
		arr(num);
	}
} 