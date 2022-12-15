import java.util.*;
public class Trapped_water{
	public static int Trapped_water(int height[]){
		int n=height.length;
		// calculate left max bar
		int leftmax[]=new int[n];
		leftmax[0]=height[0];
		// loop
		for(int i=1;i<n;i++){
			leftmax[i]=Math.max(height[i],leftmax[i-1]);
		}
		// calculate right max bar
		int rightmax[]=new int [n];
		rightmax[n-1]=height[n-1];
		// loop
		for(int i=n-2;i>=0;i--){
			rightmax[i]=Math.max(height[i],rightmax[i+1]);
		}
		// calculate the water level
		int Trapped_water=0;
		int waterlevel=0;
		// loop
		for(int i=0;i<n;i++){
			waterlevel=Math.min(leftmax[i],rightmax[i]);
			Trapped_water +=waterlevel-height[i];
		}
		return Trapped_water;
	}
	public static void main(String args[]){
		int height[]={4,2,0,6,3,2,5};
		System.out.println("The water level is :: "+Trapped_water(height));
	}
}