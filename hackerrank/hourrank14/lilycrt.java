import java.io.*;
import java.util.*;
public class Solution{
	public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int arr[] = new int[n];
			HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
				h.put(arr[i],i);
			}
			//System.out.println(h);
			Arrays.sort(arr);
			int arr2[] = new int[n];
			for(int i=0;i<n;i++)
				arr2[i]=arr[n-1-i];
			for(int i=0;i<n;i++)
				arr[i]=(int)h.get(arr[i]);
			//for(int i=0;i<n;i++)
			//	System.out.print(arr[i]+" ");
			int swaps=0;
			for(int i=0;i<n;i++){
				int val = arr[i];
				if(val<0)
					continue;
				while(val!=i){
					int newvalue = arr[val];
					arr[val]=-1;
					val=newvalue;		
				}
				swaps++;
				arr[i]=-1;
				//for(int k=0;k<n;k++)
				//	System.out.print(arr[k]+" ");
			}
			for(int i=0;i<n;i++)
				arr2[i]=(int)h.get(arr2[i]);
			//for(int i=0;i<n;i++)
			//	System.out.print(arr[i]+" ");
			int swaps1=0;
			for(int i=0;i<n;i++){
				int val = arr2[i];
				if(val<0)
					continue;
				while(val!=i){
					int newvalue = arr2[val];
					arr2[val]=-1;
					val=newvalue;		
				}
				swaps1++;
				arr2[i]=-1;
				//for(int k=0;k<n;k++)
				//	System.out.print(arr[k]+" ");
			}
			System.out.println(Math.min(n-swaps,n-swaps1));
	}
}
