import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static long xo(long x){
		if(x%4==0)
			return x;
		if(x%4==1)
			return 1;
		if(x%4==2)
			return x+1;
		return 0;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){   //every 4 sequence xor results in 2..so calculate the xor values which is out of the 4 range and count the number of 4 sequence ranges..if it is even xor result with 2 display ..if odd just display//0,1,3,0,4,1,7,0,8->4to7 xor gives 0
            long L = in.nextLong();
            long R = in.nextLong();
			long x = L%4;
			long y = R%4;
			long xor = 0;
			while(x!=0){
				long value = xo(L);
				L++;
				xor = xor ^ value;
				x = L%4;
			}
			while(y!=3){
				long value = xo(R);
				xor = xor ^ value;
				R--;
				y = R%4;
			}
			long q1 = L/4;
			long q2 = R/4;
			long re = (long)Math.abs(q1-q2);
			if(re%2==0)
				xor = xor ^ 2;
			System.out.println(xor);
        }
    }
}

