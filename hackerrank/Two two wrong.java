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
		HashSet<String> h = new HashSet<String>(); 
		BigInteger num = BigInteger.valueOf(1);
		for(int i=1;i<=800;i++){
			BigInteger two = BigInteger.valueOf(2);
			num=num.multiply(two);
			String number = num.toString();
			h.add(number);
		}
		while(t>0){
			String s = in.next();
			int count = 0;
			if(s.equals(null))
				System.out.println("0");
			else{
				Iterator it = h.iterator();
				while(it.hasNext()){
					String s1 = (String)it.next();
					Pattern pattern = Pattern.compile(s1);
					Matcher matcher = pattern.matcher(s);
					while(matcher.find())
						count++;
				}
			}
			System.out.println(count);
			t--;
		}
    }
}
