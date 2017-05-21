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
		int arr[] = new int[k];
		for(int i=0;i<k;i++)
			arr[i] = in.nextInt();
		int c[] = new int[n];
		for(int i=0;i<n;i++)
			c[i] = i;
		int leader = 0;
		for(int i=0;i<k;i++){
			/*System.out.println();
			for(int j=0;j<n;j++)
				System.out.print(c[j]+" ");
			System.out.println();*/			
			int count = 1;
			int length = arr[i]%(n-(i));
			while(count<=length){
				leader++;
				leader = leader%n;
				if(c[leader]!=-1)
					count++;
			}
			System.out.print(c[leader]+1+" ");
			c[leader] = -1;
			leader = (leader + 1)%n;
			while(c[leader]==-1)
				leader = (leader + 1)%n;
		}
	}
}     

