import java.io.*;
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
            int n = in.nextInt();
            String a = in.next();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = (int)a.charAt(i);
            int s =in.nextInt();
            int tar = in.nextInt();
            if(arr[s]==arr[tar])
                System.out.println("0");
            else{
                int i=0,last=0;
                for(i=s;i<=tar;i++){
                    if(arr[i]==arr[s]) 
                        last = i;
                }
                int d = tar - last;
                for(i=tar;i>=s;i--){
                    if(arr[i]==arr[tar])
                        last = i;
                }
                int d1 = last - s;
                if(d<d1)
                    System.out.println(d);
                else
                    System.out.println(d1);
            }
            t--;
        }
    }
}
