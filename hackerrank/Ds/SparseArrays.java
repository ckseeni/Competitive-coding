import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            String inp = in.next();
            if(h.containsKey(inp)){
				int c = h.get(inp);
				c++;
				h.put(inp,c);
			}
			else{
				h.put(inp,1);
			}
        }
		int q = in.nextInt();
		while(q>0){
			String input = in.next();
			if(h.containsKey(input))
				System.out.println(h.get(input));
			else
				System.out.println("0");
			q--;
		}
    }
}
