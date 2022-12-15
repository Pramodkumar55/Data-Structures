import java.util.*;
public class Kadanes_allgo{
	public static void Kadanes(int num[]){
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++){
			currsum=currsum+num[i];
			if(currsum<0){
				currsum=0;
			}
			// if(currsum>maxsum){
			// 	maxsum=currsum;
			// }
			maxsum=Math.max(currsum,maxsum);
		}
		System.out.println("The maximu subarray sum is :: "+maxsum);

	}
	public static void main(String args[]){
		int num[]={-2,-3,4,-1,-2,1,5,-3};
		Kadanes(num);
	}
}