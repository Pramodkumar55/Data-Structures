
import java.util.*;
public class inssertion{
	public static void sort(int num[]){
		for(int i=1;i<num.length;i++){
			int temp=num[i];
			int j=i-1;
			while(j>=0 && num[j]>temp){
				num[j+1]=num[j];
				j--;
			}
			num[j+1]=temp;
		}
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String args[]){
		int num[]={5,4,3,1,2};
		sort(num);
	}
}