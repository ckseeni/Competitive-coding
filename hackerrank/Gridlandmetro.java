import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int matrix[][] = new int[n][m];
		int result=(n*m);
		int count=0;
		while(k>0){
			int r = in.nextInt();
			r=r-1;
			int c1 = in.nextInt();
			int c2 = in.nextInt();
			for(int i=c1-1;i<c2;i++){
				if(matrix[r][i]==0){
					count++;
					matrix[r][i]=1;
				}
			}
			k--;
		}
		result=result-count;
		System.out.println(result);
    }
}
