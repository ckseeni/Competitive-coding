import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Matrixlayerrot {
	public static int m,n,r;
	public static int matrix[][] = new int[300][300];

	public static void rot(int r,int c){
		int min,prev,curr;
		if(r>c)
			min=c;
		else 
			min=r;
		int rotrange=(min/2)-1;
		int rot=0;
		int co=0;
		while(rot<=rotrange){
			int i=co;
			int j=c-1-co;
			prev= matrix[i+1][j];
			for(i=co;j>=co;j--){
				curr=matrix[i][j];
				matrix[i][j]=prev;
				prev=curr;
			}
			j++;
			for(i=co+1;i<r-co;i++){
				curr=matrix[i][j];
				matrix[i][j]=prev;
				prev=curr;
			}
			i--;
			j++;
			for(;j<c-co;j++){
				curr=matrix[i][j];
				matrix[i][j]=prev;
				prev=curr;
			}
			j--;
			i--;
			for(;i>=co;i--){
				curr=matrix[i][j];
				matrix[i][j]=prev;
				prev=curr;
			}
			co++;
			rot++;
		}
	}

	public static void dis(){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();			
		}

	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
		m = in.nextInt();
		n = in.nextInt();
		r = in.nextInt();
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				int inp = in.nextInt();
				matrix[i][j]=inp;
			}
		}
		while(r>0){
			rot(m,n);
			r--;
		}
		dis();
		
   }
}
