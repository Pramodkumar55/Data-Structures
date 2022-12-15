import java.util.*;
public class stock{
	public static int stock(int price[]){
		int buyprice=Integer.MAX_VALUE;
		int maxprof=0;
		for(int i=0;i<price.length;i++){
			if(buyprice<price[i]){
				int profit=price[i]-buyprice;
				maxprof=Math.max(profit,maxprof);
			}
			else{
				buyprice=price[i];
			}
		}
		return maxprof;
	}
	public static void main(String args[]){
		int price[]={7,1,5,3,6,4};
		System.out.println("The maximum profit is :: "+stock(price));
	}
}