import java.util.Scanner;
import java.io.IOException;
public class Graph{
	static int visit[] = new int[27];
	static int queue[] = new int[100];
	static int r=-1,f=0;
	public static void bfs(int a[][]){
		int deq,k;
		while(r+1!=f){
			deq=queue[f];
			f++;
			System.out.println((char)(deq+64));
			for(k=1;k<27;k++){
				if(a[deq][k]==1&&visit[k]==1){
					r++;
					queue[r]=k;
					visit[k]=0;
				}
			}
		}
		return;
	}
	public static void main(String args[])throws Exception{
		int a[][] = new int[27][27];
		System.out.println("Enter the graph by representing the edges like A->B means AB separated by new lines 1 to terminate");
		Scanner in = new Scanner(System.in);
		String s1 = new String();
		s1 = in.nextLine();
		while(!s1.equals("1")){			
			char[] inp = s1.toCharArray();
			int i = (int)inp[0]-64;
			int j = (int)inp[1]-64;
			a[i][j]=1;
			visit[i]=1;
			visit[j]=1;
			//a[j][i]=1;  Uncomment this to make it as a undirected graph
			s1 = in.nextLine();
		}
		System.out.println("Enter source point:");
		s1 = in.nextLine();
		char[] inp = s1.toCharArray();
		int i = inp[0]-64;
		visit[i]=0;
		int k;
		for(k=1;k<27;k++){
			if(a[i][k]==1&&visit[k]==1){
				r++;
				queue[r]=k;
				visit[k]=0;
			}
		}
		bfs(a);
		for(i=1;i<27;i++){
			if(visit[i]==1){
				System.out.println((char)(i+64));
				for(k=1;k<27;k++){
					if(a[i][k]==1&&visit[k]==1){
						r++;
						queue[r]=k;
						visit[k]=0;
					}
				}
				bfs(a);	
			}
		}
	}
}
