import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     	int n = in.nextInt();
		int arr[] = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
			if(max<arr[i])
				max = arr[i];
		}		
		int l = in.nextInt();
		int h = in.nextInt();
		int maximum = Math.max(h,max);
		int count[] = new int[maximum+1];
		for(int i=0;i<n;i++)
			count[arr[i]]++;
		for(int i=l+1;i<h;i++){
			if(count[i]!=1)
				System.out.print(i+" ");
		}
	}
}

