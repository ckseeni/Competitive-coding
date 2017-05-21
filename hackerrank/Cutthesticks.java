import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cutthesticks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int count=n;
		if(n>=1&&n<=1000){
			for(int arr_i=0;arr_i<n;arr_i++)
				arr[arr_i]=in.nextInt();
			System.out.println(count);
			Arrays.sort(arr);
			int min=arr[0];
			while(min!=1001&&min>0&&count>0){
				for(int i=0;i<n;i++){
					arr[i]=arr[i]-min;
					if(arr[i]==0){
						arr[i]=1001;
						count--;
					}
				}	
				if(count>0)
					System.out.println(count);
				Arrays.sort(arr);
				min=arr[0];
			}			
		}
    }
}
