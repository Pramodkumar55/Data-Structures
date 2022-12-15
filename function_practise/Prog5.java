// Write a Java method to compute the sum of the digits in an integer


public class Prog5{
	public static void Sum(int n){
		int sum=0;
		while(n>0){
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
		}
		System.out.println(sum);
	}
	public static void main(String args[]){
	Sum(123456);
	}
}