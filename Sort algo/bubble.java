import java.util.*;
public class bubble{
	public static void sort(int num[]){
		int i=0;
		int j=0;
		for(i=0;i<num.length-1;i++){
			for(j=0;j<(num.length-1)-i;j++){
				if(num[j]>num[j+1]){
					int temp=0;
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
				// System.out.print(num[j]+" ");
				// System.out.println();
			}
		}
		for(i=0;i<=num.length-1;i++){
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String args[]){
		int num[]={5,4,1,3,2};
		sort(num);
	}
}



