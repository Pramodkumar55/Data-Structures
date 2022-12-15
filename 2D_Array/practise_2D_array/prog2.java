
import java.util.*;
public class prog2{
	public static void ary(int num[][]){
		int sum=0;
		int row=num.length-1;
		int col=num[0].length-1;
		// for(int i=0;i<= row;i++){
			for(int j=0;j<= col;j++){
				// if(num[i][j]==num[1][j]){
					sum+=num[1][j];
				// }
			}
		// }
		System.out.println(sum);

	}
	public static void main(String args[]){
		int num[][]={
			{1,2,7,4},
			{5,6,7,8},
			{7,7,11,12},
			{13,14,7,16}
		};
		ary(num);
	}
}