import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
			String b = Long.toString(x,2);
			StringBuffer buffer = new StringBuffer();
			for(int i=0;i<b.length();i++)
				buffer.append("1");
			String larger = buffer.toString();
			long l = Long.parseLong(larger,2);
			System.out.println(l-x);
            // your code goes here
        }
    }
}

