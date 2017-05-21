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
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int c=0;
		while(k>0&&c<n){
			int max=0,maxIndex=-1;
			for(int i=c;i<n;i++){
				if(arr[i]>max){
					max=arr[i];
					maxIndex=i;
				}
			}
			if(max==arr[c])
				continue;
			int temp=arr[c];
			arr[c]=arr[maxIndex];
			arr[maxIndex]=temp;
			k--;
			c++;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
    }
}
