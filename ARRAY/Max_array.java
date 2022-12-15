import java.util.*;
public class Max_array{
	public static void sub(int num[]){
		int cp=0;
		int sum=0;
		int ms=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++){
			for(int j=i;j<num.length;j++){
				sum=0;
				for(int k=i;k<=j;k++){
					System.out.print(num[k]+" ");
					sum=sum+num[k];
				}
				// System.out.println(sum);
				cp++;
				System.out.println();
				System.out.println("The sum of the row is:: "+sum);
				System.out.println();
				if(sum>ms){
					ms=sum;
				}
				// sum=0;
			}
			System.out.println();
		}
		System.out.println("the pairs = "+cp);
		System.out.println("The max sum is :: "+ms);
		
	}
	public static void main(String args[]){
		int num[]={1,-2,6,-1,3};
		sub(num);
	}
}
