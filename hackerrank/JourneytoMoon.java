import java.io.*;
import java.util.*;

public class Solution {
	public static int root(int x,int arr[]){
		while(arr[x]!=x)
			x=arr[x];
		return arr[x];
	}

   public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int I = Integer.parseInt(temp[1]);
      	int arr[] = new int[N];
		int count[] = new int[N];

		for(int i=0;i<N;i++){
			arr[i]=i;
			count[i]=0;
		}

        for(int i = 0; i < I; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
          // Store a and b in an appropriate data structure of your choice
			int roota = root(a,arr);
			int rootb = root(b,arr);
			if(roota<rootb){
				int tot = count[roota]+count[rootb];
				count[roota] = tot;
				arr[rootb]=roota;
			}
			else{
				int tot = count[roota]+count[rootb];
				count[rootb] = tot;
				arr[roota]=rootb;
			}
        }
		for(int i=0;i<N;i++){
			int index = root(arr[i],arr);
			
			count[index] = count[index]+1;
		}
		long combinations = 0	;
		//for(int i=0;i<N;i++)
		//	System.out.print(count[i]);
		Arrays.sort(count);

		for(int i=count.length-1;i>0;i--){
			if(count[i]==0)
				break;
			for(int j=i-1;j>=0;j--){
				if(count[j]==0)
					break;
				combinations = combinations + (count[i]*count[j]);
			}
		}   
        
        // Compute the final answer - the number of combinations
       
        System.out.println(combinations);

    }
}

 


