import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		//int m[][] = new int[1000001][1000001];
		int n = in.nextInt();
		int row = 1000001;
		int col = 1000001;
		for(int i=0;i<n;i++){
			int r = in.nextInt();
			int c = in.nextInt();
			if(r<row)
				row = r;
			if(c<col)
				col = c;
		}
		//long re = long
		System.out.println((long)row*col);
    }
}
