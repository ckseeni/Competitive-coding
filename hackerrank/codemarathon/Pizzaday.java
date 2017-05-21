import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int matrix[][] = new int[N][M];
		int cost[][] = new int[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++)
				matrix[i][j] = in.nextInt();
		}
		cost[N-1][M-1] = matrix[N-1][M-1];
		for(int i=N-2;i>=0;i--)
			cost[i][M-1] = cost[i+1][M-1]+matrix[i][M-1];		
		for(int j=M-2;j>=0;j--)
			cost[N-1][j] = cost[N-1][j+1] + matrix[N-1][j];
		for(int i=N-2;i>=0;i--){
			for(int j=M-2;j>=0;j--){
				int max=0;
				if(cost[i+1][j]>cost[i][j+1])
					max=cost[i+1][j];
				else
					max=cost[i][j+1];
				cost[i][j] = max + matrix[i][j];
			}
		}
		System.out.println(cost[0][0]);
	}
}

