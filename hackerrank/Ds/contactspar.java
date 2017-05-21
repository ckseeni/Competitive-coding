import java.io.*;
import java.util.*;

class TrieNode{
	HashMap<Character,TrieNode> h = new HashMap<Character,TrieNode>();
	HashMap<Character,Integer> count = new HashMap<Character,Integer>();
	
	void add(String s){
		HashMap<Character,TrieNode> he = h;
		HashMap<Character,Integer> cou = count;
		for(int i=0;i<s.length();i++){
			TrieNode t;
			char c = s.charAt(i);
			if(he.containsKey(c)){
				t = he.get(c);
				int co= cou.get(c);
				cou.put(c,co+1);
				//System.out.println("asdfa");
			}
			else{
				t = new TrieNode();
				he.put(c,t);
				cou.put(c,1);
				//System.out.println(h);
			}
			he = t.h;
			cou = t.count;
		}
	}
	public void countString(String s){
		HashMap<Character,TrieNode> he = h;
		HashMap<Character,Integer> cou = count;
		for(int i=0;i<s.length()-1;i++){
			TrieNode t;
			char c = s.charAt(i);
			if(he.containsKey(c)){
				t = he.get(c);
				//System.out.println(c);
			}
			else{
				System.out.println("0");
				return;	
			}
			he = t.h;
			cou = t.count;
		}
		if(cou.get(s.charAt(s.length()-1))==null)
			System.out.println("0");
		else
			System.out.println(cou.get(s.charAt(s.length()-1)));
	}

}

public class Solution{
	public static TrieNode root = new TrieNode();
	public static void main(String args[]){
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
