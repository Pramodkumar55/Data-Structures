import java.util.*;
public class selection{
	public static void sort(int num[]){
		for(int i=0;i<num.length-1;i++){
			int minpos=i;
			for(int j=i+1;j<num.length;j++){
				if(num[minpos]>num[j]){
					minpos=j;
				}
			}
			int temp=num[i];
			num[i]=num[minpos];
			num[minpos]=temp;
		}
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String args[]){
		int num[]={5,4,1,3,2};
		// int num[]={5,4,3,2,7,6};
		sort(num);
	}
} 