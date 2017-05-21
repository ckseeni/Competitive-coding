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
			long n = in.nextLong();
			String s = Long.toString(n,2);
			//System.out.println(s);
			StringBuffer s1 = new StringBuffer();
			int remaining = 32 - s.length();
			//System.out.println(remaining);
			for(int i=0;i<remaining;i++)
				s1.append("0");
			s1.append(s);
			//s1.reverse();
			//System.out.println(s1);
			s = new String(s1);
			StringBuffer s2 = new StringBuffer();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='1')
					s2.append("0");
				if(s.charAt(i)=='0')
					s2.append("1");
			}
			String ne = new String(s2);
			//System.out.println(ne);
			long v = 0;
			int c =0;
			for(int i=ne.length()-1;i>=0;i--){
				if(ne.charAt(i)=='1'){
					v = v +(long)Math.pow(2,c);
					//System.out.println(v);
				}
				c++;
			}
			//System.out.println(Long.parseLong(ne,2));
			System.out.println(v);
			t--;
		}

    }
}
