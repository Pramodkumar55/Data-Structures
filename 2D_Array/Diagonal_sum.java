// import java.util.*;
// public class Diagonal_sum{
// 	// int sum=0;
// 	public static int ary(int num[][]){
// 		int sum=0;
// 		for(int i=0;i<=num.length-1;i++){
// 			for(int j=0;j<=num[0].length-1;j++){
// 				if(i == j){
// 					sum+=num[i][j];
// 				}
// 				else if(i+j == num.length-1){
// 					 sum=sum+num[i][j];
// 				}
// 			}
// 		}
// 		return sum;
// 	}
// 	public static void main(String args[]){
// 		int num[][]={
// 			{1,2,3,4},
// 			{5,6,7,8},
// 			{9,10,11,12},
// 			{13,14,15,16}
// 		};
// 		System.out.println(ary(num));
// 	}
// }



//optimized


import java.util.*;
public class Diagonal_sum{
	// int sum=0;
	public static int ary(int num[][]){
		int sum=0;
		for(int i=0;i<=num.length-1;i++){
			sum+=num[i][i];
			if(i != num.length-1-i){
				sum+=num[i][num.length-1-i];
			}
		}
		return sum;
	}
	public static void main(String args[]){
		int num[][]={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		System.out.println(ary(num));
	}
}