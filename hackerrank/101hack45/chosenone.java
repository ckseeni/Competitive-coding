import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static long gcd(long a,long b){
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		long arr[] = new long[n];
		for(int i=0;i<n;i++)
			arr[i] = in.nextLong();
		long pre[] = new long[n];
		long suf[] = new long[n];
		//const of prefix arr:
		pre[0] = arr[0];
		for(int i=1;i<n;i++)
			pre[i] = gcd(pre[i-1],arr[i]);
		//const of suffix arr:
		suf[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--)
			suf[i] = gcd(suf[i+1],arr[i]);
		if(arr[0]%suf[1]!=0){
			System.out.println(suf[1]);
			return;
		}
		for(int i=1;i<n-1;i++){
			long g = gcd(pre[i-1],suf[i+1]);
			if(arr[i]%g!=0){
				System.out.println(g);
				return;	
			}
		}
		if(arr[n-1]%pre[n-2]!=0){
			System.out.println(pre[n-2]);
			return;
		}
    }
}

