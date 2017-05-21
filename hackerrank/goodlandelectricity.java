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
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
		char[] arrc = new char[n];
		for(int i=0;i<n;i++){
			if(arr[i]==0) 
				arrc[i] = '0';
			else
				arrc[i] = '1';
		}
        String s = new String(arrc);
        char[] arr1 = new char[2*k];
        for(int i=0;i<2*k;i++)
            arr1[i] = '0';
        String ks = new String(arr1);
        if(s.contains(ks))
            System.out.println("-1");
        else{
			int f[] = new int[n];
        	int range = k-1,i=range,c=0;
			while(true){	
				while(arr[i]!=1)
					i--;
				c++;
				i = i+range+1;
				int x = i;
				if(i>=n)
					break;
				i = i + range;
				int y = i;
				if(i>=n){
					c++;					
					break;
				}
			}    
			
			System.out.println(c);
        }
    }
}
