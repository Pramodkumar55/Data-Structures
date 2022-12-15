// import java.util.*;
// public class stair_srch{
// 	public static boolean ary(int num[][],int key){
// 		int i=0;
// 		int j=num[0].length-1;
// 		while(i<num.length && j>=0){
// 			if(num[i][j]==key){
// 				System.out.println("Found at : "+i +","+j);
// 				return true;
// 			}
// 			// else if(key >num[i][j]){
// 			// 	i++;
// 			// }
// 			// else{
// 			// 	j--;
// 			// }
// 			else if(key <num[i][j]){
// 				j--;
// 			}
// 			else{
// 				i++;
// 			}
// 		}
// 		// return false;
// 		System.out.println("Not found ");
// 		return false;
// 	}
// 	public static void main(String args[]){
// 		int num[][]={
// 			{1,2,3,4},
// 			{5,6,7,8},
// 			{9,10,11,12},
// 			{13,14,15,16}
// 		};
// 		ary(num,7);
// 	}
// }


//arry starting position at low bound


import java.util.*;
public class stair_srch{
	public static boolean ary(int num[][],int key){
		int i=num.length-1;
		int j=0;
		while(i>=0 && j<=num[0].length-1){
			if(num[i][j]==key){
				System.out.println("Found at : "+i +","+j);
				return true;
			}
			
			else if(key <num[i][j]){
				i--;
			}
			else{
				j++;
			}
		}
		// return false;
		System.out.println("Not found ");
		return false;
	}
	public static void main(String args[]){
		int num[][]={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		ary(num,10);
	}
}



