import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Connectedgridcells {
	public static int n,m,max=0,count=0;
	public static int matrix[][] = new int[10][10];

	public static void dfs(int i,int j){
		if(matrix[i][j]==1){
			matrix[i][j]=0;
			count++;
			if(j+1<m){
				if(matrix[i][j+1]==1)	
					dfs(i,j+1);
			}
			if(j-1>=0){
				if(matrix[i][j-1]==1)
					dfs(i,j-1);
			}
			if(i-1>=0){
				if(matrix[i-1][j]==1)
					dfs(i,j);
			}	
			if(i+1<n){
				if(matrix[i+1][j]==1)
					dfs(i+1,j);
			}
			if((i-1)>=0&&(j-1)>=0){
				if(matrix[i-1][j-1]==1)
					dfs(i-1,j-1);
			}	
			if((i-1)>=0){
				if(matrix[i-1][j+1]==1)
					dfs(i-1,j+1);
			}	
			if((j-1)>=0){
				if(matrix[i+1][j-1]==1)
					dfs(i+1,j-1);
			}
			if((i+1<n)&&(j+1<m)){
				if(matrix[i+1][j+1]==1)
					dfs(i+1,j+1);
			}
		}
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				int e = in.nextInt();
				matrix[i][j]=e;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(matrix[i][j]==1){
					dfs(i,j);
					if(count>max){
						max=count;
						count=0;
					}
					count=0;
				}
			}
		}
		System.out.println(max);
   }
}
