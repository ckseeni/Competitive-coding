import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class TrieNode{
	HashMap<Character,TrieNode> h = new HashMap<Character,TrieNode>();
	HashMap<Character,Integer> count = new HashMap<Character,Integer>();;
	
	
	public void countString(String s){
		for(int i=0;i<s.length()-1;i++){
			TrieNode t;
			char c = s.charAt(i);
			if(h.containsKey(c)){
				t = h.get(c);
				System.out.println(c);
			}
			else{
				System.out.println("0");
				return;	
			}
			h = t.h;
			count = t.count;
		}
		System.out.println(count.get(s.charAt(s.length()-1)));
	}

	public void add(String s){
		
		for(int i=0;i<s.length();i++){
			TrieNode t;
			char c = s.charAt(i);
			if(h.containsKey(c)){
				t = h.get(c);
				int co= count.get(c);
				count.put(c,co+1);
				System.out.println("asdfa");
			}
			else{
				t = new TrieNode();
				h.put(c,t);
				count.put(c,1);
				System.out.println(h);
			}
			h = t.h;
			count = t.count;
		}
	}

}


public class Solution {
	
	public static TrieNode root = new TrieNode();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named TrieNode. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n>0){
			String s1 = in.next();
			String s2 = in.next();
			if(s1.equals("add"))
				root.add(s2);
			else
				root.countString(s2);
			//System.out.println(root.h);
			n--;
		}
		
    }
}

