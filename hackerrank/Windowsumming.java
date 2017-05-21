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
        int w = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
		int k=0,s=0;;
		while(k<w-1){
			s=s+arr[k];
			System.out.print(s+" ");
			k++;
		}
        int j=0;
        while(true){
            int sum=0;
            if(j==n-w+1)
                break;
            for(int c=0;c<w;c++){
                sum=sum+arr[j+c];
            }
            System.out.print(sum+" ");
            j++;
        }
    }
}
