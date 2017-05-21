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
		int n[] = new int[t];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<t;i++){
			n[i]=in.nextInt();
			if(max<n[i])
				max=n[i];
		}
		if(t==1&&n[0]==0){
			System.out.println("1");
			return;
		}
		BigInteger series[] = new BigInteger[max+1];
		series[0] = BigInteger.ONE;
		series[1] = BigInteger.ONE;
		for(int i=2;i<=max;i++){
			BigInteger se = series[i-2];
			BigInteger m = BigInteger.valueOf(i-1);
			se = se.multiply(m);
			series[i] = series[i-1].add(se);
		}
		BigInteger b = BigInteger.valueOf((int)Math.pow(10,9));
		BigInteger s = BigInteger.valueOf(7);
		b = b.add(s);
		for(int i=0;i<t;i++){
			
			BigInteger mo = series[n[i]].mod(b);
			System.out.println(mo);

		}
    }
}
