
// import java.util.*;
// public class p1{
// 	public static void arrr(){
// 		Scanner sc=new Scanner(System.in);
// 		int marks[]=new int[2];
// 		marks[0]=87;
// 		marks[1]=98;
// 		System.out.println(marks[1]);
// 		int number[]={2,3,6};
// 		System.out.println(number[2]);
// 		int mar[]=new int[15];
// 		mar[0]=sc.nextInt();
// 		mar[1]=sc.nextInt();
// 		mar[2]=sc.nextInt();
// 		mar[3]=sc.nextInt();
// 		System.out.println("vv");

// 		System.out.println(mar[2]);
// 		System.out.println((mar[2]+mar[3]+mar[1])/3);
// 		System.out.println(mar.length);


// 	}
// 	public static void main(String args[]){
// 		arrr();
// 	}
// }
// // System.out.print()




// public class p1{
// 	public static void arrr(){
// 		int num[]={15,45,12,36,15,47};
// 		System.out.println();
// 		for(int i=0;i<num.length;i++){
// 			System.out.println(num[i]);
// 		}


// 		for(int i=0;i<num.length;i++){
// 			System.out.println(num[i]+1);
// 		}

// 	}
// 	public static void main(String args[]){
// 		arrr();
// 	}
// }


public class p1{
	public static void arrr(int num[],int nonchange){
		nonchange=15;

		for(int i=0;i<num.length;i++){
			// System.out.println(num[i]+1);
		num[i]=num[i]+1;
		}

	}
	public static void main(String args[]){
		int num[]={15,45,12,36,15,47};
		int nonchange=5;
		System.out.println(nonchange);
		arrr(num,nonchange);
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		// System.out.println(nonchange);
		// arrr(num);
		// array is suppport call by reference
	}
}


