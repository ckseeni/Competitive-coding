import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static int minDistIndex(int dist[],Boolean spt[],int v){
		int minValue=Integer.MAX_VALUE,minIndex=-1;
		for(int i=0;i<v;i++){
			if(spt[i]==false&&dist[i]<=minValue){
				minIndex=i;
				minValue=dist[i];
			}
		}
		return minIndex;
	}

	public static void prims(int graph[][],int s,int V){
		int dist[] = new int[V];
		Boolean mst[] = new Boolean[V];
		long result=0;
		for(int i=0;i<V;i++){
			dist[i]=Integer.MAX_VALUE;
			mst[i]=false;	
		}
		dist[s]=0;
		for(int i=0;i<V-1;i++){
			int u = minDistIndex(dist,mst,V);
			mst[u]=true;
			for(int v=0;v<V;v++){
				if(mst[v]==false&&graph[u][v]!=-1&&(graph[u][v])<dist[v])
					dist[v]=graph[u][v];
			}
		}
		for(int i=0;i<V;i++)
			result=result+dist[i];
		System.out.println(result);
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int Graph[][] = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				Graph[i][j]=-1;
			}
		}
		int m = in.nextInt();
		for(int i=0;i<m;i++){
			int f = in.nextInt();
			int s = in.nextInt();
			int w = in.nextInt();
			f=f-1;
			s=s-1;
			if(Graph[f][s]!=-1){
				if(w<Graph[f][s]){
					Graph[f][s]=w;
					Graph[s][f]=w;
				}
			}
			else{
				Graph[f][s]=w;
				Graph[s][f]=w;
			}
		}
		int src = in.nextInt();
		prims(Graph,src-1,n);
    }
}
