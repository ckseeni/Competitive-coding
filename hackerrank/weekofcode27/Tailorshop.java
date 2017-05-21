import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
		long c = 0;
        for(int a_i=0; a_i < n; a_i++)
            a[a_i] = in.nextInt();
		Arrays.sort(a);
		int prev = 0;
		for(int i=0;i<n;i++){
			int x = a[i];
			int q = x/p;
			float qf = (float)x/p;
			if(!((float)q==qf))
				q++;
			if(prev<q){
				c = c+q;
				prev=q;
			}
			else if(prev>=q){
				q = prev + 1;
				prev = q;
				c = c+q;
			}			
		}
		System.out.println(c);
        // your code goes here
    }
}

