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
		while(n>0){
			int px = in.nextInt();
			int py = in.nextInt();
			int qx = in.nextInt();
			int qy = in.nextInt();
			int diffx = Math.abs(px-qx);
			int diffy = Math.abs(py-qy);
			if(px<qx)
				px = qx + diffx;
			else
				px = qx - diffx;
			if(py<qy)
				py = qy + diffy;
			else
				py = qy - diffy;
			System.out.println(px+" "+py);
			n--;
		}
    }
}
