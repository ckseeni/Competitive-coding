import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int q[] = new int[n+1];
            for(int q_i=1; q_i <= n; q_i++){
                q[q_i] = in.nextInt();
            }
			int flag = 0;
			for(int i=1;i<=n;i++){
				if(q[i]-i>2){
					System.out.println("Too chaotic");
					flag=1;
					break;
				}
			}
			//System.out.println("a");
			if(flag==0){
				boolean swap = false;
				long c = 0;
				//System.out.println("a");
				for(int i=1;i<=n;i++){
					for(int j=1;j<n;j++){
						if(q[j]>q[j+1]){
							int t = q[j];
							q[j] = q[j+1];
							q[j+1] = t;
							c++;
							swap = true;
						}
					}
					if(swap==true)
						swap = false;
					else
						break;
				}
				System.out.println(c);
			}
            // your code goes here
        }
    }
}/*

kangnahua 7 months ago

Since there are usually no Python codes for these exercises, I would post mine in case other beginners don't know how to read Java or C++. New Year Chaos, like others said, can be solved by using the bubble sort algorithm. It seems that one can*/

