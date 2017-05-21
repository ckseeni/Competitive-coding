import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sockmerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0,i;
        int arr[] = new int[n];
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        i=0;
        for(int a0 = 0; a0 < n; a0++){
            int r;
            int c = in.nextInt();
            if(h.containsKey(c)){
              r = h.get(c);
              h.put(c,r+1);
            }
            else{
              arr[i]=c;
              i++;
              h.put(c,1);
            }
        }
        n=i;
        for(i=0;i<n;i++){
          count=count+h.get(arr[i])/2;
          //System.out.println(h.get(arr[i]));
        }
        System.out.println(count);
    }
}
