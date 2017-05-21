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
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int ma = Math.max(n1,n2);
            int mi = Math.min(n1,n2);
            int c = 0;
            for(int i=mi;i<=ma;i++){
                int j = 2;
                for(j=2;j<=(int)Math.sqrt(i)+1;j++){
                    if(i%j==0)
                        break;
                }
                if(j>(int)Math.sqrt(i)+1)
                    c++;
            }
            System.out.println(c);
            t--;
        }
    }
}
Rupsa is a intelligent witty talkative back bench student. Maths mam was teaching about co prime numbers. Two numbers are said to be co prime if two numbers have greatest common divisor as 1 ( for example 9 and 20).As usual Rupsa was talking to friends rather listening to class. Mam got angry and assigned a hard task to Rupsa .Mam considers numbers, which are co prime with all numbers less than itself as lucky Numbers. Rupsa has to find the number of lucky numbers between two numbers (n1,n2). As Mam got irritated by Rupsa's talkative nature Mathematics mam will give attendance only if Rupsa solves the problem. Rupsa has low attendance as she bunks class to watch movies. Rupsa has to solve this problem so she can get attendance and avoid Repeat course. Will you help Rupsa in finding number of lucky numbers ?

Constraints
1 <= tt <= 100
1<=n1,n2<=10^9

Input Format

First line of input will contain number of test cases.
Each line will contain two numbers n1,n2.Its not guaranteed that n1,n2 will be in non decreasing order.

Output Format

Each line will contain number of lucky number between n1 and n2 (n1 and n2 inclusive)

Sample Input

1
1 10

Sample Output

4

Explanation

As rupsa is badly need of attendance please solve this in an optimal way.
