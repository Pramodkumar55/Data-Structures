// import java.util.*;
// public class inbuilt{
// 	public static void main(String args[]){
// 		int num[]={5,4,1,2,3};
// 		Arrays.sort(num);
// 		for(int i=0;i<num.length;i++){
// 			System.out.print(num[i]+" ");
// 		}
// 	}
// }



// with in a boundary or with in a index
// import java.util.*;
// public class inbuilt{
// 	public static void main(String args[]){
// 		int num[]={5,4,1,2,3};
// 		Arrays.sort(num,0,3);
// 		for(int i=0;i<num.length;i++){
// 			System.out.print(num[i]+" ");
// 		}
// 	}
// }



// reverrse order

// make thhe int num[] to Integer num []
// import java.util.*;
// public class inbuilt{
// 	public static void main(String args[]){
// 		Integer num[]={5,4,1,2,3};
// 		Arrays.sort(num,Collections.reverseOrder());
// 		for(int i=0;i<num.length;i++){
// 			System.out.print(num[i]+" ");
// 		}
// 	}
// }




import java.util.*;
public class inbuilt{
	public static void main(String args[]){
		Integer num[]={5,6,1,2,3};
		Arrays.sort(num,0,3,Collections.reverseOrder());
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
}