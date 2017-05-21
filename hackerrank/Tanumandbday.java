import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
			long cost = 0;
			if(x<=z&&y<=z)
				cost=(x*b)+(y*w);
			else{
				long min = Math.min(x,y);
				long corminvalue;
				if(min==x){
					corminvalue=w;
					if(y>(x+z))
						cost=min*(b+w)+z*(corminvalue);
					else
						cost=(x*b)+(y*w);	
				}
				else{
					corminvalue=b;
					if(x>(y+z))
						cost=min*(b+w)+z*(corminvalue);
					else
						cost=(x*b)+(y*w);
				}
				
			}
			System.out.println(cost);
        }
    }
}

