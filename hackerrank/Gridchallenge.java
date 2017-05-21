import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			char matrix[][] = new char[n][n];			
			for(int i=0;i<n;i++){
				String s = in.next();
				for(int j=0;j<n;j++)
					matrix[i][j]=s.charAt(j);
			}
			for(int k=0;k<n;k++){
				for(int i=0;i<n;i++){
					for(int j=0;j<n-i-1;j++){
						if(matrix[k][j]>matrix[k][j+1]){
							char temp=matrix[k][j];
							matrix[k][j]=matrix[k][j+1];
							matrix[k][j+1]=temp;
						}
					}
				}
			}
			int flag=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n-1;j++){
					if(matrix[i][j]>matrix[i][j+1]){
						flag=1;
						break;
					}
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n-1;j++){
					if(matrix[j][i]>matrix[j+1][i]){
						flag=1;
						break;
					}
				}
			}
			if(flag==1)
				System.out.println("NO");
			else	
				System.out.println("YES");
			t--;
		}
    }
}
