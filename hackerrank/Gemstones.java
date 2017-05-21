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
		int giv[] = new int[26];
		int count=1,cpy=n;
        while(n>0){
			HashMap<Character,Integer> h = new HashMap<Character,Integer>();
            String s = in.next();
           	for(int i=0;i<s.length();i++){
                if(h.containsKey(s.charAt(i))){
                    int c = h.get(s.charAt(i));
                    c++;
                    h.put(s.charAt(i),c);
                }
                else{
                    h.put(s.charAt(i),1);
					int index=(int)(s.charAt(i));
					index=index-97;
					giv[index]++;
				}
            }
			/*Set entrySet = h.entrySet();
			Iterator it = entrySet.iterator();
			int k=0;
			while(it.hasNext()){
				Map.Entry me = (Map.Entry)it.next();
				if(me.getKey==1){
					
				}
				//System.out.println(me.getValue()+"  "+me.getKey());
			}*/	
			n--;
        }
        int r=0;
		for(int a=0;a<26;a++){
			if(giv[a]==cpy)
				r++;
		}
       /* for(Integer value : h.values()){
            System.out.println("values are "+value);
         if(value==count) 
               r++;
        }
        for (Character key : h.keySet()) {
             System.out.println("Key = " + key);
		}*/
        System.out.println(r);
    }
}
