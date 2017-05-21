import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		long p[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53}; 
		while(q>0){
			long n = in.nextLong();
			long re = p[0];
			int i=1;
			while(re<=n&&i<16)
				re = re * p[i++];
			System.out.println(i-1);
			q--;
		}
    }
}
