import java.util.*;
public class Shorttest_path{	
	public static float str(String str1){
		int x=0;
		int y=0;
		for(int i=0;i<str1.length();i++){
			char dir=str1.charAt(i);
			//east
			if(dir == 'E'){
				x--;
			}
			//west
			else if(dir == 'W'){
				x++;
			}
			//north
			else if(dir == 'N'){
				y++;
			}
			//south
			else{
				y--;
			}

		}
		int X=x*x;
		int Y=y*y;
		float z=(float)Math.sqrt(X+Y);
		return z;
		// return ((float)Math.sqrt(X+Y));
	}
	public static void main(String args[]){
		String str1="WNEENESENNN";
		System.out.println(str(str1));
	}
}