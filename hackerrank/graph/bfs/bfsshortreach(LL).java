import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Graph{
	public LinkedList<Integer> adjList[];
	Graph(int n){
		adjList = new LinkedList[n+1];
		for(int i=1;i<=n;i++)
			adjList[i] = new LinkedList();	
	}
	public void addEdge(int f,int s){
		adjList[f].add(s);
		adjList[s].add(f);
	}
}

public class Solution {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			Queue<Integer> queue = new LinkedList<Integer>();
			Queue<Integer> dis = new LinkedList<Integer>();
			int n = in.nextInt();
			Graph g = new Graph(n);
			int m = in.nextInt();
			for(int i=0;i<m;i++){
				int f = in.nextInt();
				int s = in.nextInt();
				g.addEdge(f,s);
			}
			int s = in.nextInt();
			for(int i=1;i<=n;i++){
				ArrayList<Integer> visited = new ArrayList<Integer>();
				int distance[] = new int[n+1];
				int k=0;
				int flag=0,flag1=0;
				queue.add(s);
				dis.add(6);
				visited.add(s);
				if(i!=s){
					while(!queue.isEmpty()){
						int v = queue.remove();
						int d = dis.remove();
						d=d+6;
						if(g.adjList[v].contains(i)){
							distance[k]=d-6;
							k++;
							flag=1;
							break;
						}
						else{
							Iterator<Integer> it = g.adjList[v].listIterator();
							while(it.hasNext()){	
								int dest = it.next();
								if(!visited.contains(dest)){
									queue.add(dest);
									dis.add(d);
									visited.add(dest);
								}
							}
						}						
					}
					if(flag==0){
						distance[k]=-1;
						k++;
					}
					for(int j=0;j<k;j++)
						System.out.print(distance[j]+" ");
				}
				queue.clear();
				dis.clear();
			}
			System.out.println();
			t--;
		}
    }
}
