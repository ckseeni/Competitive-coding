import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
		int appleCount = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
			int value = in.nextInt();
			if(value>0){
				if((a+value)>=s&&(a+value)<=t)
					appleCount++;
			}
        }
        int[] orange = new int[n];
		int orangeCount = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
			int value = in.nextInt();
			if(value<0){
				if((b+value)>=s&&(b+value)<=t)
					orangeCount++;
			}
        }
		System.out.println(appleCount);
		System.out.println(orangeCount);
    }
}

