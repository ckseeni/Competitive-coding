import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
		int counter[] = new int[101];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
			counter[a[a_i]]++;
        }
		int max = Integer.MIN_VALUE;
		for(int i=0;i<100;i++){
			int j = i+1;
			int count = counter[i]+counter[j];
			if(max<count)
				max=count;
		}
		System.out.println(max);
    }
}

