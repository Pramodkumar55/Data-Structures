// import java.util.*;
// public class Binary_search{
// 	public static int Bin_src(int num[],int key){
// 		int start=0;
// 		int end=num.length-1;
// 		int mid=0;
// 		// for(int i=0;i<end-1;i++)
// 		while(start<=end){
// 			mid=(start+end)/2;
// 			if(num[mid]==key){
// 				System.out.println("found at index "+mid);
// 			}
// 			if(num[mid]<key){
// 				start=mid+1;
// 				return mid;
// 			}
// 			else{
// 				end=mid-1;
// 			}

// 		}
// 		return -1;
// 	}
// 	public static void main(String args[]){
// 		int num[]={1,2,3,4,5,6,7,8,9};
// 		int key=3320;
// 		// int x=Bin_src(num,key);
// 		// if(x==-1){
// 		// System.out.println("not found  "+Bin_src(num,key));
// 		// }
// 		// else{
// 		// System.out.println("fond at index "+Bin_src(num,key));
// 		// }
// 	System.out.println("fond at index "+Bin_src(num,key));

// 	}
// }


import java.util.*;
public class Binary_search{
	public static int Bin_src(int num[],int key){
		int start=0;
		int end=num.length-1;
		int mid=0;
		while(start<=end){
			mid=(start+end)/2;
			if(num[mid]==key){
				// System.out.println("found at index "+mid);
			return mid;
			}
			if(num[mid]<key){
				start=mid+1;
				// return mid;
			}
			else{
				end=mid-1;
			}

		}
		return -1;
	}
	public static void main(String args[]){
		int num[]={1,2,3,4,5,6,7,8,9};
		int key=7;
		int x=Bin_src(num,key);
		if(x==-1){
		System.out.println("not found  "+Bin_src(num,key));
		}
		else{
		System.out.println("fond at index "+Bin_src(num,key));
		}


	}
}