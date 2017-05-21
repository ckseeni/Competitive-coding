import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int m[][],n;

	public static void explosion(int i,int j){
		m[i][j] = -1;
		if(i-1>=0){
			if(m[i-1][j]==0)
				explosion(i-1,j);
			m[i-1][j] = -1;
		}	
		if(i+1<n){
			if(m[i+1][j]==0)
				explosion(i+1,j);
			m[i+1][j] = -1;
		}
		if(j-1>=0){
			if(m[i][j-1]==0)
				explosion(i,j-1);
			m[i][j-1] = -1;
		}	
		if(j+1<n){
			if(m[i][j+1]==0)
				explosion(i,j+1);
			m[i][j+1] = -1;
		}
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				m[i][j] = in.nextInt();
		}
		int q = in.nextInt();
		while(q>0){
			int p1 = in.nextInt();
			int p2 = in.nextInt();
			explosion(p1,p2);
			q--;
		}
		int c = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(m[i][j]!=-1)
					c = c+m[i][j];
			}
		}
		System.out.println(c);
    }
}
