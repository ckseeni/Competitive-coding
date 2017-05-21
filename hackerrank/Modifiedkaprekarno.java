import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		long p = in.nextLong();
		long q = in.nextLong();
		int flag=0;
		for(long i=p;i<=q;i++){
			long sq = i*i;
			String s = Long.toString(sq);
			int n=s.length();
			int l=0;
			int r=0;
			for(int j=0;j<(n/2);j++)
				l=l*10+(int)s.charAt(j)-48;
			for(int j=n/2;j<n;j++)
				r=r*10+(int)s.charAt(j)-48;
			if(l+r==i){
				System.out.print(i+" ");
				flag=1;
			}
		}
		if(flag==0)
			System.out.print("INVALID RANGE");
    }
}
