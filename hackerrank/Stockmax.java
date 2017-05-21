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
			int profit=0;
			long totalprofit=0;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(arr[i]<arr[j]){
						if(profit<arr[j])
							profit=arr[j];
					}
				}
				if(profit!=0)
					totalprofit=totalprofit+profit-arr[i];
				profit=0;
			}
			System.out.println(totalprofit);
			t--;
		}
    }
}
