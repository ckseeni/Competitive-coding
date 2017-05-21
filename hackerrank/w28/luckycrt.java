import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void dpConstruction(int[][] dp,String s,int n){
		dp[0][0] = 1;
		dp[0][(s.charAt(0)-'0')%8]++;
		for(int i=1;i<n;i++){
			for(int rem = 0;rem<8;rem++)
				dp[i][rem] = dp[i-1][rem];
			for(int rem = 0;rem<8;rem++){
				int curr = dp[i-1][rem];
				if(curr==0)
					continue;
				int next = (rem*10 + (s.charAt(i)-'0'))%8;
				dp[i][next] = (dp[i][next] + curr)%1000000007;
			}
		}
	}	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int dp[][] = new int[n][8];
		dpConstruction(dp,s,n);
		/*for(int i=0;i<n;i++){
			for(int j=0;j<8;j++)
				System.out.print(dp[i][j]+" ");
			System.out.println();
		}*/
		System.out.println(dp[n-1][0]-1);
	}
}	
