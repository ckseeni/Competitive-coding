import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*Fast doubling is based on two formulae

F(2n) = F(n)[2*F(n+1) – F(n)]
F(2n + 1) = F(n)2 + F(n+1)2*/
public class Solution {
	public static long a,b,c,d;
	public static void fast_fib(long n,long ans[]){
		if(n == 0)
		{
		    ans[0] = 0;
		    ans[1] = 1;
		    return;
		}
		fast_fib((n/2),ans);
		a = ans[0];             /* F(n) */
		b = ans[1];             /* F(n+1) */
		c = 2*b - a;
		if(c < 0)
		    c += 1000000007;
		c = (a * c) % 1000000007;      /* F(2n) */
		d = (a*a + b*b) % 1000000007;  /* F(2n + 1) */
		if(n%2 == 0)
		{
		    ans[0] = c;
		    ans[1] = d;
		}
		else
		{
		    ans[0] = d;
		    ans[1] = c+d;
		}
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
			long n = in.nextLong();
			long ans[] = new long[2];
			ans[0] = 0;
			fast_fib(n+2,ans);
			//System.out.println(ans[0]);
			BigInteger b = BigInteger.valueOf(ans[0]);
			BigInteger b2 = BigInteger.valueOf(2);
			BigInteger bn = BigInteger.valueOf(n);
			BigInteger m = BigInteger.valueOf((long)Math.pow(10,9)+7);
			b2 = b2.modPow(bn,m);
			b2 = b2.subtract(b);
			System.out.println(b2.mod(m));
		}
    }
}
