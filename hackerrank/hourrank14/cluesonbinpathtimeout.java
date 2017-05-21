import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int count = 0,level=0,d=-1,k=0,l=0;
	public static HashSet<String> arr = new HashSet<String>();
	public static int a[];

	public static void dfs(int u,int graph[][],int n){
		count++;
		if(count>d){
			String s = new String(Arrays.toString(a));
			arr.add(s);
			l--;
			count--;
			return;
		}
		for(int i=0;i<n;i++){
				if(count!=1){
					if(graph[u][i]!=-1){	
						a[l]=graph[u][i];
						l++;			
						dfs(i,graph,n);	
					}
				}
				if(count==1){
					if(graph[u][i]!=-1){		
						a[l]=graph[u][i];
						l++;			
						dfs(i,graph,n);	
						
					}
				}
		}
		count--;
		l--;	
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int graph[][] = new int[n][n];
		int m = in.nextInt();
		d = in.nextInt();
		a = new int[d];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				graph[i][j]=-1;
		}
		for(int i=0;i<m;i++){
			int u = in.nextInt();
			int v = in.nextInt();
			int c = in.nextInt();
			graph[u-1][v-1]=c;
			graph[v-1][u-1]=c;
		}
		dfs(0,graph,n);
		System.out.println(arr.size());
    }
}

