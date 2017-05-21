import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
		int den[] = {100,50,20,10,5,3,2,1};
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
			long tot = 0;
			int k=0;
            for(int q_i=1; q_i <= n; q_i++){
            	int amount = in.nextInt();
				while(amount!=0){
					if(amount>=den[k]){
						int q = amount/den[k];
						System.out.println(q);
						tot = tot + q;
						amount = amount %den[k];
					}
					k++;
				}
				k=0;
            }
			System.out.println(tot);
            // your code goes here
        }
    }
}


