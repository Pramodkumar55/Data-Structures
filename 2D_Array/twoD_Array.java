// import java.util.*;
// public class twoD_Array{
// 	public static boolean srch(int num [][],int key){	
// 		for(int i=0;i<num.length;i++){
// 			for(int j=0;j<num[0].length;j++){
// 				if(num[i][j]==key){
// 					System.out.println("The index found at :"+ i +" "+j);
// 					return true;
// 				}
// 			}
// 		}
// 		System.out.println("key not found");
// 		return false;

// 	}
// 	public static void main (String args[]){
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("ENter value for n:");
// 		int n=sc.nextInt();
// 		System.out.print("ENter value for m:");
// 		int m=sc.nextInt();

// 		int num[][]=new int [n][m];
// 		for(int i=0;i<n;i++){
// 			for(int j=0;j<m;j++){
// 				num [i][j]=sc.nextInt();
// 			}
// 		}
// 		for(int i=0;i<n;i++){
// 			for(int j=0;j<m;j++){
// 				System.out.print(num [i][j]+"  ");
// 			}
// 			System.out.println();
// 		}

// 		srch(num, 9);
// 	}
// }

// max element of the array

import java.util.*;
public class twoD_Array{
	public static void Max(int num [][]){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[0].length;j++){
				if(num[i][j]>max){
					max=num[i][j];
					// System.out.println(max);
					// return true;
				}
			}
		}
		// System.out.println("key not found");
		// return false;
		System.out.println();
		System.out.println(max);

	}
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter value for n:");
		int n=sc.nextInt();
		System.out.print("ENter value for m:");
		int m=sc.nextInt();

		int num[][]=new int [n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				num [i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(num [i][j]+"  ");
			}
			System.out.println();
		}

		Max(num);
	}
}