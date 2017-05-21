import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static long min = Long.MAX_VALUE;

	public static int findRoot(int parent[],int n){
		while(parent[n]!=n)
			n=parent[n];
		return n; 
	}

	public static void removeEdge(int parent[],int dist[],int n,int u,int v){
		parent[v]=v;
		int rootu = findRoot(parent,u);
		int rootv = findRoot(parent,v);
		long du = 0,dv=0;
		for(int i=1;i<=n;i++){
			if(findRoot(parent,i)==rootu)
				du=du+(long)dist[i];
			else if(findRoot(parent,i)==rootv)
				dv=dv+(long)dist[i];
		}
		long diff = Math.abs(du-dv);
		if(diff<min)
			min=diff;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int dist[] = new int[n+1];
		int parent[] = new int[n+1];
		int uarr[] = new int[n-1];
		int varr[] = new int[n-1];
		int cpy[] = new int[n+1];
		for(int i=1;i<=n;i++){
			dist[i]=in.nextInt();
			parent[i]=i;
		}
		for(int i=0;i<n-1;i++){
			int u = in.nextInt();
			int v = in.nextInt();
			int rootu = findRoot(parent,u);
			int rootv = findRoot(parent,v);
			if(rootu>rootv){
				int temp=u;
				u=v;
				v=temp;
			}
			uarr[i]=u;
			varr[i]=v;
			parent[v]=u;	
		}
		for(int i=1;i<=n;i++)
			cpy[i]=parent[i];
		for(int i=0;i<n-1;i++){
			removeEdge(parent,dist,n,uarr[i],varr[i]);
			for(int k=1;k<=n;k++)
				parent[k]=cpy[k];
		}	
		System.out.println(min);
    }
}
