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
			String s = in.next();
			StringBuilder inp = new StringBuilder(s);
			String r = new String(inp.reverse());
			int i=0;
			for(i=1;i<s.length();i++){
				int abs1 = Math.abs(s.charAt(i)-s.charAt(i-1));
				int abs2 = Math.abs(r.charAt(i)-r.charAt(i-1));
				if(abs1!=abs2)
					break;
			}
			if(i<s.length())
				System.out.println("Not Funny");
			else
				System.out.println("Funny");
			t--;
		}
    }
}
