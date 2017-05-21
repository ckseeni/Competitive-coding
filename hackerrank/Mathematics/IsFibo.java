import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		HashSet<Long> arr = new HashSet<Long>();
		long a = 0;
		long b = 1;
		arr.add(a);
		arr.add(b);
		long c = 0;	
		while(true){
			c = a + b;
			if(c>(long)Math.pow(10,10))
				break;
			arr.add(c);
			a=b;
			b=c;
		}
		//System.out.println(arr);
		int t = in.nextInt();
		while(t>0){
			long n = in.nextLong();
			if(arr.contains(n))
				System.out.println("IsFibo");
			else
				System.out.println("IsNotFibo"); 
			t--;
		}
    }
}
