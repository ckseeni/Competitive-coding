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
        long x = in.nextLong();
        long a[]=new long[100000];
        for(int i=0;i<n;i++)
            a[i]=in.nextLong();
        int count=0;
        for(int i=0;i<n;i++){
            long flag=a[i]%x;
            if(flag==0)
                count++;
        }
        long max=(n-1)*2;
        long sum=0;
        for(int i=0;i<count;i++){
            sum=sum+max;
            max=max-2;
        }
		sum  = sum%(long)(Math.pow(10,7)+9);
       System.out.println(sum);
    }
}
