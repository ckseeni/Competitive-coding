/* IMPORTANT: Multiple classes and nested static classes are supported */


  
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int n = in.nextInt();
            int arr[] = new int[n];
            int max  = -1;
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
                if(arr[i]>max)
                    max = arr[i];
            }
            Arrays.sort(arr);
            long d = 0;
             long mod = 1000000007;
            for(int i=n-1;i>=0;i--){
                d+=(long)i*arr[i] -(long) (n-1-i)*arr[i];
            }
           // System.out.println(max+" "+d);
           BigInteger res = BigInteger.valueOf(d*max);
           BigInteger m = BigInteger.valueOf((long)1000000007);
            //long res = (d*max)%mod;
            System.out.println(res.mod(m));
            t--;
        }
       // System.out.println("Hello World!");
    }
}

