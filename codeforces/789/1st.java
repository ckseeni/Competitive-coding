import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = in.nextInt();
		int c = 0;
		while(true){
			for(int i=0;i<n;i++){
				if(arr[i]>k){
					if(arr[i]>2*k)
						arr[i] = arr[i] - 2*k;
					else
						arr[i] = -1;
					c++;
				}
			}
			int f = 0;
			for(int i=0;i<n;i++){
				if(arr[i]>k)
					f=1;
			}
			if(f==0)
				break;
		}
		float s = 0;
		for(int i=0;i<n;i++){
			if(arr[i]!=-1)
				s++;
		}
		c = c + (int)Math.ceil(s/2);
		System.out.println(c);
	}
}     

