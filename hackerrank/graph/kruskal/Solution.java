import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static long dist = 0;
	public static int edgeSrc[] = new int[9000000];
	public static int edgeDest[] = new int[9000000];
	public static int edgeWt[] = new int[9000000];

	public static int root(int n,int parent[]){
		while(parent[n]!=n)
			n=parent[n];
		return n;	
	}

	public static void sortEdges(int m){
		for(int i=0;i<m-1;i++){
			int temp=0;
			for(int j=i+1;j<m;j++){
				if(edgeWt[i]>edgeWt[j]){
					temp=edgeWt[i];
					edgeWt[i]=edgeWt[j];
					edgeWt[j]=temp;
					temp=edgeSrc[i];
					edgeSrc[i]=edgeSrc[j];
					edgeSrc[j]=temp;
					temp=edgeDest[i];
					edgeDest[i]=edgeDest[j];
					edgeDest[j]=temp;
				}
				else if(edgeWt[i]==edgeWt[j]){
					if(edgeSrc[i]+edgeDest[i]+edgeWt[i]>edgeSrc[j]+edgeDest[j]+edgeWt[j]){
						temp=edgeWt[i];
						edgeWt[i]=edgeWt[j];
						edgeWt[j]=temp;
						temp=edgeSrc[i];
						edgeSrc[i]=edgeSrc[j];
						edgeSrc[j]=temp;
						temp=edgeDest[i];
						edgeDest[i]=edgeDest[j];
						edgeDest[j]=temp;
					}
				}
			}	
		}
	}

	public static void kruskal(int s,int m,int n){
		int parent[] = new int[n];	
		int count=1;		
		for(int i=0;i<n;i++)
			parent[i]=i;
		sortEdges(m);
		for(int i=0;count<n;i++){
			int src = edgeSrc[i];
			int dest = edgeDest[i];
			int wt = edgeWt[i];
			int roots = root(src,parent);
			int rootd = root(dest,parent);
			if(roots!=rootd){
				parent[roots]=rootd;
				dist=dist+wt;
				count++;
			}
		}
		System.out.println(dist);
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for(int i=0;i<m;i++){
			edgeSrc[i]=-1;
			edgeDest[i]=-1;
			edgeWt[i]=-1;
		}
		for(int i=0;i<m;i++){
			int f = in.nextInt();
			int s = in.nextInt();
			int w = in.nextInt();
			f=f-1;
			s=s-1;
			edgeSrc[i]=f;
			edgeDest[i]=s;
			edgeWt[i]=w;
		}
		int src = in.nextInt();
		kruskal(src-1,m,n);
    }
}
