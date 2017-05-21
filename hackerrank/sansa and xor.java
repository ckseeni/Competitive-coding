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
			long arr[] = new long[n];
			for(int i=0;i<n;i++)
				arr[i] = in.nextLong();
			long xor = 0;
			if(n%2==1){
				for(int i=0;i<n;i=i+2)
					xor = xor ^ arr[i];
			}
			
			System.out.println(xor);
			t--;
		}
    }
}
