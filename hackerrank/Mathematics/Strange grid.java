import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		long r = in.nextLong();
		long c = in.nextLong();
		if(r%2==0){
			long st = 1;
			long index = r/2;
			index = index-1;
			long row = (index*10)+1;
			long col = (c-1)*2;
			System.out.println(row+col);
		}
		else{
			long index = r/2;
			long row = (index*10);
			long col = (c-1)*2;
			System.out.println(row+col);
		}
    }
}
