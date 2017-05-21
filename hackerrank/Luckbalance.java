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
		int arr[] = new int[n];
		int res = 0,j=0;
		for(int i=0;i<n;i++){
			int l = in.nextInt();
			int imp = in.nextInt();		
			res = res + l;
			if(imp==1){
				arr[j]=l;
				j++;
			}	
		}
		Arrays.sort(arr);
		for(int i=0;i<n-k;i++)
			res=res-2*arr[i];
		System.out.println(res);
    }
}
