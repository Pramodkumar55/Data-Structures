import java.util.*;
public class Spiralmatrx{
	public static void ary(int num[][]){
		int strt_col=0;
		int strt_row=0;
		int end_row=num.length-1;
		int end_col=num[0].length-1;
		while(strt_row <= end_row && strt_col <= end_col){
			//top
			for(int j=strt_col;j<=end_col;j++){
				System.out.print(num[strt_row][j]+" ");
			}
			//right
			for(int i=strt_row+1;i<=end_row;i++){
				System.out.print(num[i][end_col]+" ");
			}
			//bottom
			for(int j=end_col-1;j>=strt_col;j--){
				if(strt_row==end_row){
					break;
				}
				System.out.print(num[end_row][j]+" ");
			}
			//left
			for(int i=end_row-1;i>=strt_row+1;i--){
				if(strt_col == end_col){
					break;
				}
				System.out.print(num[i][strt_col]+" ");
			}
			strt_col++;
			strt_row++;
			end_row--;
			end_col--;
		}
		

	}
	public static void main(String args[]){
		int num[][]={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
			// {1,2,3},
			// {4,5,6},
			// {7,8,9}
		};
		ary(num);
		// System.out.println(ary(num));
	}
}
