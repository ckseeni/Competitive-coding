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
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = in.nextInt();
		Arrays.sort(arr);
		int mindiff = Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++){
			int diff = Math.abs(arr[i]-arr[i+1]);
			if(diff<mindiff)
				mindiff = diff;
		}
		
		for(int i=0;i<n-1;i++){
			int diff = Math.abs(arr[i]-arr[i+1]);
			if(diff==mindiff)
				System.out.print(arr[i]+" "+arr[i+1]+" ");
		}
    }
}
