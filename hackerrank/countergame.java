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
			BigInteger n = in.nextBigInteger();
			String b = n.toString(2);
			//System.out.println(b);
			char arr[] = b.toCharArray();
			int c = 0;
			int i = b.length()-1;
			while(arr[i]!='1'){
				arr[i]='1';
				i--;
			}
			arr[i]='0';
			String b1 = new String(arr);
			//System.out.println(b1);
			for(int j=0;j<b.length();j++){
				if(arr[j]=='1')
					c++;
			}
			//System.out.println(c);
			if(c%2==0)
				System.out.println("Richard");
			else
				System.out.println("Louise");
			t--;
		} 
    }
}
/*First of all, for any number N to be power of two it must be of the format 100..00 (in binary) i.e. single 1 followed by all 0s. Now, consider the two operations allowed :


1) If N is not a power of 2, reduce the counter by the largest power of 2 less than N : This is equivalent to removing the first 1 until the number N is power of 2. Thus number of such operations would eqaute to count of all 1s before the last 1.

Example : If N=11010, the largest power of 2 less than N would be 10000, reducing N by it we get 1010, which is equivalent to removing first 1.


2) If N is a power of 2, reduce the counter by half of N : This operation is equivalent to removing trailing zeros, or right shift. Number of such operations would be equal to count of all 0s after the final 1.


Combining the above two steps : we need to count "1s before last 1" and "0s after last 1". To bring uniformity in action, we subtract 1 from N, which will flip all the trailing zeros (and also last 1). Now, the only operation required, is to count 1s in the number i.e. to get popcount for (n-1).

Let me take an example to demonstrate why popcount(n-1)&1 works. It might seem trivial, yet, please bear with me ! Suppose N=1101001100(binary), then the operations will be :

------------------- N is not power of 2 ----------------------
N = 1101001100          Louise will reduce it by 1000000000
N =  101001100          Richard will reduce it by 100000000
N =    1001100          Louise will reduce it by    1000000
N =       1100          Richard will reduce it by      1000

------------------- N(100) is power of 2 ----------------------
N =        100          Louise will reduce counter by half
N =        10           Richard will reduce counter by half
N =        1            Louise can't make a move, hence, loses
                        Richard is the winner !

The above example shows that N=1101001100 can be better represented as "1101001100", where we need to count "1s to the left of 1" and "0s to the right of 1", to know the total number of operations.

Thus, total number of operations = 4 (1s in 1101001) + 2 (0s in 100) = 6. Since, this number (6) is even, hence, Richard wins.


This is all that is required to know the answer, but, as you can see, this forces us to do calculation in two parts : counting 1s and counting 0s.

Somehow, if we could modify the "100" part of "1101001100" to "011" thus changing the number to "1101001011", all we would need is to count 1s in this number i.e. setBits in the number.

This final requirement to flip all trailing 0s to 1s and last 1 to 0 (without modifying the other bits), can be easily achieved by subtracting 1 from the number N. For N=1101001100, we have N-1 = 1101001011. Thus popcount(N-1) gives the number of operations in the game, which gives winner depending upon if its even or odd.*/
