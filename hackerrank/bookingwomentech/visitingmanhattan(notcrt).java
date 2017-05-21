import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class loc{
	int a;
	int b;
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int l = in.nextInt();
		int h = in.nextInt();
		ArrayList<loc> arr = new ArrayList<loc>();
		for(int i=0;i<l;i++){
			loc lo = new loc();
			lo.a = in.nextInt();
			lo.b = in.nextInt();
			arr.add(lo);
		}
		int min = Integer.MAX_VALUE;
		int p=-1;
		for(int i=0;i<h;i++){
			int xx = in.nextInt();
			int yy = in.nextInt();
			int d = 0;
			for(int j=0;j<arr.size();j++){
				loc lo = arr.get(j);
				d = d + (int)Math.abs(lo.a-xx) + (int)Math.abs(lo.b-yy);
				if(d>=min)
					break;
			}
			if(min>d){
				min=d;
				p = i+1;
			}
		}
		System.out.println(p);
    }
}
