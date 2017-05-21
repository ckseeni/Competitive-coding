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
            long n = in.nextLong();
            long c = 0;
            if(n<3){
                System.out.println("0");
                t--;
                continue;
            }
            long st = 3;
            long m = n%3;
            long en = n-m;
            long diff = en-st;
            long q1 = diff/3+1;
            st = 5;m=n%5;en = n-m;diff = en-st;
            long q2 = diff/5+1;
            st = 15;m=n%15;en = n-m;diff = en-st;
            long q3 = diff/15+1;
            System.out.println(q1+q2-q3);
           // System.out.println(q2);
            //System.out.println(q3);
            t--;
        }
    }
}

//Raghav loves to watch lot of movies. As Raghav celebrates birthday, his friends presented him n Movie DVD's numbered from 1 to n. Though Raghav has n movie DVD'S he cannot watch all movies as he has mathematics test on divisibility of numbers on next day. So Raghav decided to watch movies whose dvd numbers are divisible by 3 or 5.You are Raghav's intelligent friend. Help Raghav in finding the count of movies which he can watch. Will you help Raghav?

Constraints
1 <= tt <=100
1 <= n <=10^18

Input Format

First line of input contains the number of test case(tt).
Each line of tt contains a single number(n)

Output Format

For each test case print the number of movies Raghav can watch

Sample Input

2
15
5

Sample Output

7
2

Explanation

1.3,5,6,9,10,12,15 are numbers which are divisble by 3 or 5.
2.3 and 5 are divisble by 3 or 5
