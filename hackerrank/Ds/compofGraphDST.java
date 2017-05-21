import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int root(int x,int arr[]){
		while(arr[x]!=x)
			x=arr[x];
		return arr[x];
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[(2*n)+1];
		//System.out.println((2*n)+1);
		for(int i=1;i<((2*n)+1);i++)
			arr[i]=i;
		for(int i=0;i<n;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int roota = root(a,arr);	
			int rootb = root(b,arr);
			arr[rootb]=roota;
		}
		int count[] = new int[(2*n)+1];
		for(int i=1;i<(2*n+1);i++){
			int s = root(arr[i],arr);
			count[s]=count[s]+1;
		}
		Arrays.sort(count);
		for(int i=0;i<(2*n+1);i++){
			if(count[i]!=0&&count[i]!=1){
				System.out.print(count[i]+" ");
				break;
			}
		}	
		System.out.print(count[2*n]+" ");
    }
}
