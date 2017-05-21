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
		int h[] = new int[n+1];
		int l[] = new int[n+1];
		long max=0;
		int count=1;
		for(int i=1;i<=n;i++){
			int b = in.nextInt();
			if(b>h[count-1]){
				h[count]=b;
				l[count]=1;
				count++;
			}
			else{
				int c=0;
				while(count>1&&b<=h[count-1]){
					count--;
					c=c+l[count];
					long area = h[count]*c;
					max = (long)Math.max(area,max);		
				}
				h[count] = b;
				l[count] = c+1;
				count++;
			}
		}
		int c=0;
		while(count>1){
			count--;
			c=c+l[count];
			long area = h[count]*c;
			max = (long)Math.max(area,max);		
		}
		System.out.println(max);
    }
}
