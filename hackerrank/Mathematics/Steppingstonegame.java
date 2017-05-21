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
			long r = (long)8*n+1;
			double re = Math.sqrt(r); 
			if((long)re-re==0)
				System.out.println("Go On Bob "+(long)re/2);
			else
				System.out.println("Better Luck Next Time");
			t--;
		}
    }
}//triangle nunbers;pos->re/2
