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
        int k = in.nextInt();
        int rem[] = new int[k];
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            rem[a%k]++;
        }
        int result=0;
        for(int i=0;i<=k/2;i++){
            int opp = (k-i)%k;
            if(i==opp){
                result=result+Math.min(rem[i],1);
            }
            else{
                result=result+Math.max(rem[i],rem[opp]);
            }   
        }
        System.out.println(result);
    }
}
