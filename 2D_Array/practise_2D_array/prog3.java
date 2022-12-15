import java.util.*;
public class prog3{
	public static void ary(int num[][]){

	}
	public static void main(String args[]){
		int num[][]={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[0].length;j++){
				System.out.print(num[j][i]+" ");
			}
			System.out.println();
		}
	}
}