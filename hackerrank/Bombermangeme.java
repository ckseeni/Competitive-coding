import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void change(char mat[][],char matrix[][],int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(matrix[i][j]!='O'){	
					char left='t',right='t',top='t',bottom='t';
					if(j-1>=0){
						if(matrix[i][j-1]=='O')
							left='f';	
					}
					if(j+1<c){
						if(matrix[i][j+1]=='O')
							right='f';	
					}
					if(i-1>=0){
						if(matrix[i-1][j]=='O')
							top='f';	
					}
					if(i+1<r){
						if(matrix[i+1][j]=='O')
							bottom='f';	
					}
					if(left=='t'&&right=='t'&&top=='t'&&bottom=='t')
						mat[i][j]='a';
					else
						mat[i][j]='.';
				}
				else
					mat[i][j]='.';
			}
		}
		for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					if(mat[i][j]=='a')
						mat[i][j]='O';	
				}
		}	
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();
		char matrix[][] = new char[r][c];
		for(int i=0;i<r;i++){
			String s = in.next();
			for(int j=0;j<c;j++)
				matrix[i][j] = s.charAt(j);
		}
		if(n==1){
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++)
					System.out.print(matrix[i][j]);
				System.out.println();
			}
			return;
		}
		if(n%2==0){
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++)
					System.out.print('O');
				System.out.println();
			}
			return;
		}
		char threemat[][] = new char[r][c];
		char fivemat[][] = new char[r][c];
		change(threemat,matrix,r,c);
		change(fivemat,threemat,r,c);
		if(n%4==3){
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++)
					System.out.print(threemat[i][j]);
				System.out.println();
			}
			return;	
		}
		if(n%4==1){
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++)
					System.out.print(fivemat[i][j]);
				System.out.println();
			}
			return;
		}
    }
}
