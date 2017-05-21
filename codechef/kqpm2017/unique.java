import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
		while(T>0){
			int n = in.nextInt();
			HashSet<String> h = new HashSet<String>();
			for(int i=0;i<n;i++){
				String s = in.next();
				h.add(s);
			}
			List<String> list = new ArrayList<String>(h);
			Collections.sort(list);
			System.out.println(list.size());
			for(String s1:list)
				System.out.println(s1);
			T--;
		}
    }
}


