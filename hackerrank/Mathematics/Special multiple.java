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
			BigInteger one = new BigInteger("1");
			BigInteger tot = new BigInteger("1");
			BigInteger nine = new BigInteger("9");
			BigInteger zero = new BigInteger("0");
			BigInteger n = in.nextBigInteger();
			while(true){
				String binary = tot.toString(2);
				//System.out.println(binary);
				BigInteger oneagain = new BigInteger(binary);
				BigInteger re = nine.multiply(oneagain);
				BigInteger rem = re.mod(n);
				if(rem.compareTo(zero)==0){
					System.out.println(re);
					break;
				}
				tot = tot.add(one);
				
			}
			t--;
		}
    }
}
