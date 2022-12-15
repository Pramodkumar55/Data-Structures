import java.util.*;
public class Reverse{
	public static void rev(int num[]){
		int first=0;
		int end=num.length-1;
		while(first<end){
			int temp=num[first];
			num[first]=num[end];
			num[end]=temp;

			first++;
			end--;
		}
	}
	public static void main(String args[]){
		int num[]={2,3,6,9};
		rev(num);
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
}