import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stringcons {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while(q>0){
			String s = in.next();
			HashSet<Character> h = new HashSet<Character>();
			for(int j=0;j<s.length();j++)
				h.add(s.charAt(j));
			System.out.println(h.size());
			q--;
		}		
   }
}
