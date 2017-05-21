import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int n;
	public static int crosssum(int[] arr,int low,int mid,int high){
		int lsum=-100000,sum=0;
		for(int i=mid;i>=low;i--){
			sum=sum+arr[i];
			if(sum>lsum)
				lsum=sum;
		}	
		int rsum=-100000;
		sum=0;	
		for(int i=mid+1;i<=high;i++){
			sum=sum+arr[i];
			if(sum>rsum)
				rsum=sum;
		}
		int tsum = lsum+rsum;
		return tsum;
	}
	public static int maxsum(int[] arr,int low,int high){
		if(low==high)
			return arr[low];
		int mid = (low+high)/2;
		int lsum = maxsum(arr,low,mid);
		int rsum = maxsum(arr,mid+1,high);
		int crsum = crosssum(arr,low,mid,high);
		if(lsum>rsum&&lsum>crsum)
			return lsum;
		else if(rsum>lsum&&rsum>crsum)
			return rsum;
		else
			return crsum;
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			n =in.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i]=in.nextInt();
			int csum = maxsum(arr,0,n-1); 
			int ncsum = 0;
			for(int i=0;i<n;i++){
				if(arr[i]>=0)
					ncsum=ncsum+arr[i];
			}
			if(ncsum==0){
				Arrays.sort(arr);
				ncsum=arr[n-1];
			}
			System.out.println(csum+" "+ncsum);			
			t--;
		}
    }
}
