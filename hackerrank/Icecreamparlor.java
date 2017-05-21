import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int m = in.nextInt();
			int n = in.nextInt();
			int arr[] = new int[n];
			int rem1[] = new int[m];
			int rem2[] = new int[m];
			for(int i=0;i<n;i++)			
				arr[i] = in.nextInt();
			for(int i=0;i<m;i++){
				rem1[i]= -1;
				rem2[i] = -1;
			}
			for(int i=0;i<n;i++){
				int index = arr[i]%m;
				if(arr[i]<m){
					if(rem1[index]==-1)
						rem1[index] = arr[i];
					else
						rem2[index] = arr[i];
				}	
			}
			int first = -1,second = -1;
			for(int i=0;i<=m/2;i++){
				int opp = (m-i)%m;
				if(i==opp){
					if(rem2[i]!=-1){
						first = rem1[i];
						second = rem2[i];
					}
				}
				else{
					if(rem1[i]!=-1&&rem1[opp]!=-1){
						first = rem1[i];
						second = rem1[opp];	
					}
				}
			}
			
			int findex = -1,sindex = -1;
			for(int i=0;i<n;i++){
				if(arr[i]==first){
					findex = i+1;
					break;
				}
			}
			if(first==second)
				arr[findex-1] = -1;
			for(int i=0;i<n;i++){
				if(arr[i]==second){
					sindex = i+1;
					break;
				}
			}
			if(findex>sindex){
				int temp = findex;
				findex = sindex;
				sindex = temp;
			}
			System.out.println(findex+" "+sindex);
			t--;
		}
    }
}
