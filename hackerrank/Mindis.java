import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mindis {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			int e = in.nextInt();
			if(h.containsKey(e)){
				int j = h.get(e);
				int d = i-j;
				if(d<min)
					min=d;
			}
			else
				h.put(e,i);
		}
		if(min!=10000)
			System.out.println(min);
		else
			System.out.println("-1");
   }
}
