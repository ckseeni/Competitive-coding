import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 //gfg no of integeral points between two points
	public static long gcd(long n1,long n2){
		if(n2!=0)
			return gcd(n2,n1%n2);
		else
			return n1;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			long x1 = in.nextLong();
			long y1 = in.nextLong();
			long x2 = in.nextLong();
			long y2 = in.nextLong();
			long diffx = (long)Math.abs(x1-x2);
			long diffy = (long)Math.abs(y1-y2);
			long re = gcd((long)Math.max(diffx,diffy),(long)Math.min(diffx,diffy));
			System.out.println(re-1);
			t--;
		}
    }
}
