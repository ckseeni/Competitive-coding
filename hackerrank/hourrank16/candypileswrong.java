import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
		int min = Integer.MAX_VALUE,minindex=-1;
		for(int c_i=0; c_i < n; c_i++){
            if(c[c_i]<min){
				min = c[c_i];
				minindex = c_i;
			}
        }
		int mincount = 0;
		int co = 0;
		for(int i=0;i<n;i++){
			if(c[i]==min)
				mincount++;
		}
		for(int i=0;i<n;i++){
			if(c[i]*2==min*2)
				co++;
		}
		if(mincount==1)
			System.out.println(min*2+" 1");
		else
			System.out.println(min+" "+n);
    }
}

