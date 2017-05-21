import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static PriorityQueue<Long> prq = new PriorityQueue<Long>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++)
			prq.add(in.nextLong());
		long count = 0;
		while(prq.size()>1){
			long min1 = prq.poll();	
			long min2 = prq.poll();
			count = count + min1 + min2;
			prq.add(min1+min2);
		}
		System.out.println(count);
		/*System.out.println(prq.size());
		while(!prq.isEmpty()){
			System.out.println(prq.poll());
		}*/
    }
}

