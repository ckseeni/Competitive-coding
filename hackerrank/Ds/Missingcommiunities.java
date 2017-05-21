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
		int q = in.nextInt();
		int arr[] = new int[n+1];
		int count[] = new int[n+1];
		//System.out.println((2*n)+1);
		for(int i=1;i<(n+1);i++){
			arr[i]=i;
			count[i]=1;
		}
		for(int i=0;i<q;i++){
			char a = in.next().charAt(0);
			if(a=='Q'){
				int b = in.nextInt();
				int rootb = root(b,arr);	
				System.out.println(count[rootb]);
			}
			else{
				int b = in.nextInt();
				int c = in.nextInt();
				int rootb = root(b,arr);	
				int rootc = root(c,arr);
				if(rootb!=rootc){
					int sum = count[rootb]+count[rootc];
					count[rootb]=sum;
					arr[rootc]=rootb;
				}
			}
		}
		
    }
}
