import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int s1 = in.nextInt();
		int s2 = in.nextInt();
		int t = in.nextInt();
		double d = l * (double)Math.sqrt(2);
		int s3 = Math.abs(s1-s2);
		while(t>0){
			double dis = in.nextDouble();
			double d2 = (double)Math.sqrt(dis)*(double)Math.sqrt(2);
			BigDecimal b1 = new BigDecimal(Math.abs(d-d2));
			BigDecimal b2 = new BigDecimal(s3);
			BigDecimal re = b1.divide(b2,RoundingMode.CEILING);
			System.out.println(re);
			t--;
		}
    }
}

/*Hm, doesn't look like I can paste a picture in here, but I'll try to give you some information that helped me. You're trying to solve for time, so you want an equation with time where you can isolate time, and solve it. Distance = speed x time. There are two distances available to you, the distances of the bottom left corner of both squares. Using this information, and the picture provided with the problem, you can solve for time.

0 |
Add Comment Parent Permalink

*/
