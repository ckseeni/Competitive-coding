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
			Queue<Integer> queue = new LinkedList<Integer>();
			Queue<Integer> dis = new LinkedList<Integer>();
			int n = in.nextInt();
			int m = in.nextInt();
			int matrix[][] = new int[n+1][n+1];
			for(int i=0;i<m;i++){
				int f = in.nextInt();
				int s = in.nextInt();
				matrix[f][s]=1;
				matrix[s][f]=1;
			}
			int s = in.nextInt();
			for(int i=1;i<=n;i++){
				ArrayList<Integer> visited = new ArrayList<Integer>();
				int distance[] = new int[n+1];
				int k=0;
				int flag=0;
				queue.add(s);
				dis.add(6);
				visited.add(s);
				if(i!=s){
					while(!queue.isEmpty()){
						int v = queue.remove();
						int d = dis.remove();
						if(matrix[v][i]==1){
							distance[k]=d;
							k++;
							flag=1;
							break;
						}
						else{
							d=d+6;
							for(int j=1;j<=n;j++){
								if(matrix[v][j]==1){
									if(!visited.contains(j)){
										queue.add(j);
										dis.add(d);
										visited.add(j);
									}
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
