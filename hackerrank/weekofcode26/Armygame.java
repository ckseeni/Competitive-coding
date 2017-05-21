import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        float n1 =(float)n/2;
		float m1 =(float)m/2;
		if(n1-(n/2)>0)
			n1=n1+(float)0.5;
		if(m1-(m/2)>0)
			m1=m1+(float)0.5;
		int nn = (int)n1;
		int mm = (int)m1;
		//System.out.println(n1+" "+m1);
		//System.out.println(nn+" "+mm);
		System.out.println(nn*mm);
    }
}

