import java.io.*;
import java.util.*;

class TrieNode{
	HashMap<Character,TrieNode> h = new HashMap<Character,TrieNode>();
	boolean isWord=false;
	boolean path=false;
	int add(String s){
		HashMap<Character,TrieNode> he = h;
		boolean p=path;
		for(int i=0;i<s.length();i++){
			TrieNode t;
			char c = s.charAt(i);
			if(he.containsKey(c)){
				t = he.get(c);
				if(t.isWord==true){
					System.out.println("BAD SET");
					System.out.println(s);
					return -1;
				}
				//System.out.println("asdfa");
			}
			else{
				
				t = new TrieNode();
				he.put(c,t);
				p=true;
				//System.out.println(h);
			}
			if(i==s.length()-1){
				if(t.h.isEmpty()==false){
					System.out.println("BAD SET");
					System.out.println(s);
					return -1;
				}
				t.isWord=true;
			}
			else
				t.isWord=false;
			he = t.h;
			p=t.path;
		}
		return 0;
	}
}

public class Solution{
	public static TrieNode root = new TrieNode();
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n>0){
			String s = in.next();
			int re = root.add(s);
			if(re==-1)
				return;
			n--;
		}	
		if(n==0)
			System.out.println("GOOD SET");	
	}
}
