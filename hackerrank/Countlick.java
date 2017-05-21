import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Countlick {
	public static int n,m,count=0;
	public static char matrix[][] = new char[100][100];

	public static void dfs(int i,int j){
		//if(matrix[i][j]=='.'){
			int way=0;
			matrix[i][j]='X';
			if(j+1<m){
				if(matrix[i][j+1]=='.'){
					way++;	
					dfs(i,j+1);
				}
			}
			if(j-1>=0){
				if(matrix[i][j-1]=='.'){
					way++;
					dfs(i,j-1);
				}
			}
			if(i-1>=0){
				if(matrix[i-1][j]=='.'){
					way++;
					dfs(i-1,j);
				}
			}	
			if(i+1<n){
				if(matrix[i+1][j]=='.'){
					way++;
					dfs(i+1,j);
				}
			}
			if(way>1)
				count++;
		 return;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		while(t>0){
			n = in.nextInt();
			m = in.nextInt();
			for(int i=0;i<n;i++){
				String s = in.next();
				for(int j=0;j<m;j++)
					matrix[i][j]=s.charAt(j);
			}
			int k = in.nextInt();
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(matrix[i][j]=='M'){
						dfs(i,j);
						break;
					}
				}
			}
			if(count==k)
				System.out.println("Impressed");
			else
				System.out.println("Oops! and count is "+count);
			count=0;
			t--;
		}
   }
}
