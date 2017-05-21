import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) 
		    a[i] = input.nextInt();
		int unfairness = Integer.MAX_VALUE,st=-1,en=-1;
		Arrays.sort(a);
		int diff[] = new int[n];
		for(int i=0;i<n-1;i++)
			diff[i]=Math.abs(a[i]-a[i+1]);
		//for(int i=0;i<n-1;i++)
		//	System.out.print(diff[i]+" ");
		for(int i=0;i<n-1-k+2;i++){
			int j=i,c=1,sum=0;
			while(c<k){
				sum=sum+diff[j];
				j++;
				c++;	
			}	
			if(sum<unfairness){
				st=i;	
				en = i+k-1;
				unfairness=sum;
			}
		}
		//System.out.println("st "+st+"  end  "+en);
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=st;i<=en;i++){
			max=Math.max(max,a[i]);
			min=Math.min(min,a[i]);	
		}
		unfairness = max - min;
		System.out.println(unfairness);
	}
}
