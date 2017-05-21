import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long reverse(long num){
        long s=0,c=1;
        while(num>0){
            int r = (int)num%10;
            num=num/10;
            s=s*10+r;
        }
        return s;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long i = in.nextLong();
        long j = in.nextLong();
        long k = in.nextLong();
        long c=0;
        for(long l=i;l<=j;l++){
            long r = reverse(l);
            long abs = Math.abs(l-r);
			//System.out.println(r);
            if(abs%k==0||abs/k==0)
                c++;
        }
        System.out.println(c);
    }
}
