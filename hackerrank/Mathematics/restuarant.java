import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int gcd(int s1,int s2){
		int x = Math.min(s1,s2);
        for(int i=x;i>=1;i--){
            if(s1%i==0&&s2%i==0)
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            if(s1==s2){
                System.out.println("1");
                t--;
                continue;
            }
            int a = s1*s2;
            int min = Math.min(s1,s2);
            int g = gcd(s1,s2);
            int sa = g*g;
            System.out.println(a/sa);
            t--;
        }
    }
}
