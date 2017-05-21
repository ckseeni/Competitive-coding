import java.io.*;
//use pythagoras th.  
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
			int d2 = in.nextInt();
			int k = in.nextInt();
			int c = 0;
			double dp = Math.sqrt(d2);
			int di = (int)Math.sqrt(d2);
			//System.out.println(dp-(double)dp);
			if(dp-(double)dp==(double)0.0){ 
				for(int i=0;i<(int)Math.sqrt(d2);i++){
					double jd = Math.sqrt(d2-(i*i));
					int ji = (int)Math.sqrt(d2-(i*i));
					if(jd-(double)ji==0)
						c=c+4;
				}	
				//System.out.println("k"+k);
				if(c>k)
					System.out.println("impossible");	
				else
					System.out.println("possible");	
			}
			else
				System.out.println("possible");				
			t--;
		}
    }
}
