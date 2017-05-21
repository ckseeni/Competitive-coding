import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static HashMap<Integer,ArrayList> h = new HashMap<Integer,ArrayList>();
		
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
		
	public static void dijkstra(int graph[][],int s,int V){
		int dist[] = new int[V];
		Boolean spt[] = new Boolean[V];
		for(int i=0;i<V;i++){
			dist[i]=Integer.MAX_VALUE;
			spt[i]=false;
		}
		dist[s]=0;
		for(int i=0;i<V-1;i++){
			int u = minDistIndex(dist,spt,V);
			spt[u]=true;
			ArrayList arr = h.get(u);
			if(dist[u]==Integer.MAX_VALUE)
				continue;
			for(int j=0;j<arr.size();j++){
				int v = (int)arr.get(j);
				if(spt[v]==false&&graph[u][v]!=0&&dist[u]!=Integer.MAX_VALUE&&(dist[u]+graph[u][v]<dist[v]))
					dist[v]=dist[u]+graph[u][v];	
			}
			/*for(int v=0;v<V;v++){
				if(spt[v]==false&&graph[u][v]!=0&&dist[u]!=Integer.MAX_VALUE&&(dist[u]+graph[u][v]<dist[v]))
					dist[v]=dist[u]+graph[u][v];
			}*/
		}
		for(int i=0;i<V;i++){
			if(i!=s){
				if(dist[i]==Integer.MAX_VALUE)
					System.out.print("-1 ");
				else
					System.out.print(dist[i]+" ");
			}
		}
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			int Graph[][] = new int[n][n];
			int m = in.nextInt();
			for(int i=0;i<m;i++){
				int f = in.nextInt();
				int s = in.nextInt();
				int w = in.nextInt();
				f=f-1;
				s=s-1;
				if(Graph[f][s]!=0){
					if(w<Graph[f][s]){
						Graph[f][s]=w;
						Graph[s][f]=w;
					}
				}
				else{
					Graph[f][s]=w;
					Graph[s][f]=w;
					if(h.containsKey(f)){
						ArrayList arr = h.get(f);
						arr.add(s);
						h.put(f,arr);
					}
					else{
						ArrayList a = new ArrayList();
						a.add(s);
						h.put(f,a);
					}
					if(h.containsKey(s)){
						ArrayList arr = h.get(s);
						arr.add(f);
						h.put(s,arr);
					}
					else{
						ArrayList a = new ArrayList();
						a.add(f);
						h.put(s,a);
					}
				}					
			}
			int src = in.nextInt();
			dijkstra(Graph,src-1,n);
			System.out.println();
			h.clear();
			t--;
		}
    }
}
