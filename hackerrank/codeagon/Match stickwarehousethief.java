import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[][] crate = new int[c][2];
        for(int crate_i=0; crate_i < c; crate_i++){
            for(int crate_j=0; crate_j < 2; crate_j++){
                crate[crate_i][crate_j] = in.nextInt();
            }
        }
        // your code goes here
		for(int i=0;i<c;i++){
			for(int j=i+1;j<c;j++){
				if(crate[i][1]<crate[j][1]){
					int temp = crate[i][1];
					crate[i][1] = crate[j][1];
					crate[j][1] = temp;
					temp = crate[i][0];
					crate[i][0] = crate[j][0];
					crate[j][0] = temp;
				}
			}
		}
		int co = 0;
		long tot = 0;
		for(int i=0;i<c;i++){
			if(co+crate[i][0]<=n){
				co = co+crate[i][0];
				tot = tot + (crate[i][0]*crate[i][1]);
			}				
			else{
				int d = n-co;
				tot = tot + (d*crate[i][1]);
				break;
			}
		}
		System.out.println(tot);
    }
}

