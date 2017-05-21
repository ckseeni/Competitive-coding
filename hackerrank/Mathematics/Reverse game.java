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
			int n = in.nextInt();
			int k = in.nextInt();
			int arr[] = new int[n];
			int l = 0,r = n-1,loc=-1;
			int i=0;
			for(i=0;l<n/2;i++){
				arr[i]=r;
				r--;
				if(arr[i]==k)
					loc = i;
				i++;				
				arr[i]=l;
				l++;
				if(arr[i]==k)
					loc=i;
			}
			if(n%2==1){
				arr[i]=l;
				if(arr[i]==k)
					loc = i;
			}
			System.out.println(loc);
			//for(i=0;i<n;i++)
				//System.out.print(arr[i]+" ");
			t--;
		}
    }
}
