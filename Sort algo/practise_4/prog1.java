import java.util.*;

public class prog1{
	public static boolean arr(int num[]){
		for(int i=0;i<num.length-1;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]==num[j]){
					return true;
				}
			}
		}
		return false;
	}
	// public static void main(String args[]){
	// 	Scanner sc=new Scanner(System.in);
	// 	System.out.println("Enter the elements you want");
	// 	int n=sc.nextInt();
	// 	int num=new int [n];
	// 	for(int i=0;i<n-1;i++){
			
	// 		System.out.println("Enter the "+ i +" element");
	// 		num[i]=sc.nextInt();
	// 	}
	// }1.2.3.1
// 	public static void main(String args[]){
// 		int num[]={1,2,3,4};
// 		System.out.println(arr(num));
// 	}
// }



// import java.util.*;
// public class prog1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want");
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the elements ");
			num[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
				System.out.print(num[i]+" ");
			}
			System.out.println();
		System.out.println(arr(num));	
	}
}