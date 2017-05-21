import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer,ArrayList<String>> h = new HashMap<Integer,ArrayList<String>>();
		PriorityQueue<Integer> pri = new PriorityQueue<Integer>();
		for(int i=0;i<n;i++){
			String s = in.next();
			if(s.equals("store")){
				String email = in.next();		
				int p = in.nextInt();
				if(h.containsKey(-p)){
					ArrayList<String> alr = h.get(-p);
					alr.add(email);
					h.put(-p,alr);
				}
				else{
					pri.add(-p);
					ArrayList<String> a = new ArrayList<String>();
					a.add(email);
					h.put(-p,a);
				}
			}
			else{
				if(pri.isEmpty())
					System.out.println("-1");
				else{
					int t = pri.poll();
					ArrayList<String> res = h.get(t);
					System.out.println(res.get(0));	
					if(res.size()==1)
						h.remove(t);
					else{
						res.remove(0);
						//System.out.println(res);
						h.put(t,res);
						pri.add(t);	
					}
				}
			} 
		}
		//	System.out.println(pri);
    }
}
