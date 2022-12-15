import java.util.*;
public class pairs{
	public static void pair(int num[]){
		int pc=0;
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				System.out.print("("+num[i]+ ","+num[j]+ ") ");
				pc++;
			}
			System.out.println();
		}
		System.out.println("number of pairs = "+pc);
	}

	public static void main(String argss[]){
		int num[]={2,4,6,8,10};
		pair(num);
	}
}