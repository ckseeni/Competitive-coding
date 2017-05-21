import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static PriorityQueue<Long> q = new PriorityQueue<Long>();
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        for(int i=0;i<n;i++)
            q.add(in.nextLong());
        int count = 0;
        while(q.peek()<k){
            long a = q.poll();
            if(q.isEmpty()){
                System.out.println("-1");
                return;
            }
            long b = q.poll();
            long c = a+(2*b);
            q.add(c); 
            count++;
        }
        System.out.println(count);
    }
}
