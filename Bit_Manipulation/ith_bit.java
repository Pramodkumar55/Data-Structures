// geat i th bit


// import java.util.*;
// public class ith_bit{
// 	public static void bty(int n,int i){
// 		int bitMask=1<<i;
// 		if((n & bitMask)==0){
// 			System.out.println("00");
// 		}
// 		else{
// 			System.out.println("11");
// 		}
// 	}
// 	public static void main(String args[]){
// 		// int n=10;
// 		bty(10,0);
// 	}
// }



// set i th bit


// import java.util.*;
// public class ith_bit{
// 	public static int bty(int n,int i){
// 		int bitMask=1<<i;
// 		return (n | bitMask);
// 	}
// 	public static void main(String args[]){
// 		// int n=10;
// 		System.out.println(bty(10,2));
// 	}
// }

// / clear i th bit

// import java.util.*;
// public class ith_bit{
// 	public static int bty(int n,int i){
// 		int bitMask=1<<i;
// 		return (n & ~bitMask);
// 	}
// 	public static void main(String args[]){
// 		// int n=10;
// 		System.out.println(bty(10,1));
// 	}
// }

// upadte i th bit

// import java.util.*;
// public class ith_bit{
// 		public static int clr(int n,int i){
// 		int bitMask=1<<i;
// 		return (n & ~bitMask);
// 	}
// 	public static int set(int n,int i){
// 		int bitMask=1<<i;
// 		return (n | bitMask);
// 	}
// 	public static int bty(int n,int i,String bit){
// 		if(bit == "set"){
// 			return (set(10,1));
// 		}
// 		else{
// 			return (clr(10,1));
// 		}
// 	}
// 	public static void main(String args[]){
// 		// int n=10;
// 		System.out.println(bty(10,2,"set"));
// 	}
// }


// clear last i th bits



// import java.util.*;
// public class ith_bit{
// 	public static int bty(int n,int i){
// 		int bitMask=(~0)<<i;
// 		return (n & bitMask);
// 	}
// 	public static void main(String args[]){
// 		// int n=10;
// 		System.out.println(bty(15,2));
// 	}
// }

import java.util.*;
public class ith_bit{
	public static int bty(int n,int i,int j){
		int a=(~0)<<(j+1);
		int b=(1)<<i-1;
		int bitMask=a | b;
		return (n & bitMask);
	}
	public static void main(String args[]){
		// int n=10;
		System.out.println(bty(10,2,4));
	}
}