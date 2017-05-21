import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stockmax {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++)
				arr[i]=in.nextInt();
			long count=0,sum=0,profit=0;
			int max=arr[n-1];
			for(int k=n-2;k>=0;k--){
				if(max<arr[k]){
					profit=profit+(count*max)-sum;
					max=arr[k];
					count=0;
					sum=0;
				}
				else{
					count++;
					sum=sum+arr[k];
				}
			}
			profit=profit+(count*max)-sum;
			System.out.println(profit);
			t--;
		}
    }
}

