import java.util.*;
public class sub_array{
	public static void sub(int num[]){
		int cp=0;
		int sum=0;
		for(int i=0;i<num.length;i++){
			for(int j=i;j<num.length;j++){
				for(int k=i;k<=j;k++){
					System.out.print(num[k]+" ");
					sum=sum+num[k];
				}
				// System.out.println(sum);
				cp++;
				System.out.println();
				System.out.println("The sum of the row is:: "+sum);
				System.out.println();
				sum=0;
			}
			System.out.println();
		}
		System.out.println("the pairs = "+cp);
		
	}
	public static void main(String args[]){
		int num[]={2,4,6,8,10};
		sub(num);
	}
}