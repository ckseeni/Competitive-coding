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
			arr[i]=in.nextInt();
		int diff[] = new int[n-1];
		for(int i=0;i<n-1;i++)
			diff[i]=arr[i]-arr[i+1];
		for(int i=0;i<n-1;i++)
			System.out.print(diff[i]);
		int left=-1;
		int right=-1;
		for(int i=0;i<n-1;i++){
			if(diff[i]>0){
				left=i;
				break;
			}
		}
		for(int i=n-2;i>=0;i--){
			if(diff[i]<0){
				right=i;
				break;
			}
		}
		
	}
}
