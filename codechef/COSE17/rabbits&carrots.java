import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			int k = in.nextInt();
			long arr[] = new long[n];
			long max = -1;
			for(int i=0;i<n;i++){
				arr[i] = in.nextLong();
				if(max<arr[i])
					max=arr[i];
			}
			long v = 1,pre=1;;
			for(int i=2;v<=max;i++){
				v=(long)(Math.pow(k,i));
				pre = (long)(Math.pow(k,i-1));
			}
			int c = 0;
			for(int i=0;i<n;i++){
				if(pre%arr[i]==0)
					c++;
			}
			System.out.println(c);
			t--;
		}
    }
}


