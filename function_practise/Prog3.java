// Pallindrome in java

public class Prog3{
	public static void Pallindrome(int n){
		int a=n;
		int rev=0;
		while(n>0){
			// int rev=0;
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;

	   }
	   // return rev;
	System.out.println(rev);

	if(rev==a){
		System.out.println("pallindrome");
	}
	else{
		System.out.println("not");
	}
	}
	public static void main(String args[]){
	Pallindrome(121);
	}
}