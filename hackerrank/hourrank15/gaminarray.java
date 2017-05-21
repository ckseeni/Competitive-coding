import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i]=in.nextInt();
			int turn = 0;
			while(n>0){
				int max = Integer.MIN_VALUE;
				int maxi = -1;
				int i=0;
				for(i=0;i<n;i++){
					if(arr[i]>max){
						max=arr[i];
						//System.out.print(n);
						maxi = i;
					}
				}
				n=maxi;
				turn++;
			}
			if(turn%2==1)
				System.out.println("BOB");
			else
				System.out.println("ANDY");
        }
    }
}

