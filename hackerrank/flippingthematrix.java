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
		while(q>0){
			int n = in.nextInt();
			int m[][] = new int[2*n][2*n];
			for(int i=0;i<2*n;i++){
				for(int j=0;j<2*n;j++)
					m[i][j] = in.nextInt();
			}
			int s = 0;
			int m1 = 2*n;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					int max = 0;
					max = Math.max(m[i][j],max);
					max = Math.max(max,m[i][m1-1-j]);
					max = Math.max(max,m[m1-1-i][j]);
					max = Math.max(max,m[m1-1-i][m1-1-j]);
					s = s + max;
				}
			}
			System.out.println(s);
			q--;
		}
    }
}
/*keep in mind that; using multiple rotations, you can bring any number into the quadrant that you desire.

for any position in the upper left quadrant (position [x][y], where x and y < n (and not 2*n)), you can move numbers in any quadrant at the following positions to [x][y]:

[x][y] or // upper left quadrant [x][2*n-1-y] or // upper right quadrant [2*n-1-x][y], or // lower left quadrant [2*n-1-x][2*n-1-y] // lower right quadrant

all you need to do then is, for every position (x and y) in the upper left quadrant, you need to find the maximum of the four numbers at the above positions, sum them and print the answer.*/
