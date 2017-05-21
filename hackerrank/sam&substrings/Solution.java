import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		//ArrayList<String> a = new ArrayList<String>();
		String n = in.next();
		BigInteger s = BigInteger.valueOf(0);
		BigInteger f = BigInteger.valueOf(1);
		BigInteger m = BigInteger.valueOf((long)Math.pow(10,9)+7);
		for(int i=n.length()-1;i>=0;i--){
			int x1 = (int)n.charAt(i)-48;
			BigInteger x = BigInteger.valueOf(x1);
			BigInteger k = BigInteger.valueOf(i+1);
			BigInteger re = x.multiply(k);
			re = f.multiply(re);
			s = s.add(re);
			s = s.mod(m);
			BigInteger one = BigInteger.ONE;
			BigInteger ten = BigInteger.valueOf(10);
			f = f.multiply(ten);
			f = f.add(one);
			f = f.mod(m);
		}
		System.out.println(s);
    }
}
