import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		int matrix[][] = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++)
				matrix[i][j] = in.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<col;i++){
			if(max<matrix[0][i])
				max = matrix[0][i];
		}
		int rowarr[] = new int[max+1];
		int flag[] = new int[max+1];
		for(int i=0;i<col;i++){
			if(flag[matrix[0][i]]==0){
				rowarr[matrix[0][i]]++;
				flag[matrix[0][i]]=1;
			}
		}
		for(int i=0;i<=max;i++)
			flag[i]=0;
		for(int i=1;i<row;i++){
			for(int j=0;j<col;j++){
				if(matrix[i][j]<=max&&flag[matrix[i][j]]==0){
					rowarr[matrix[i][j]]++;
					flag[matrix[i][j]]=1;
				}	
			}
			for(int j=0;j<=max;j++)
				flag[j]=0;
		}
		for(int i=0;i<=max;i++){
			if(rowarr[i]==row)
				System.out.println(i);
		}
    }
}

