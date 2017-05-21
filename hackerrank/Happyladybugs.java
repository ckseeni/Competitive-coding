import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
			int under = 0;
			HashMap<Character,Integer> map  = new HashMap<Character,Integer>();
			for(int i=0;i<b.length();i++){
				char c = b.charAt(i);
				if(c=='_')
					under++;
				else if(map.containsKey(c)){
					int count = map.get(c);
					count++;
					map.put(c,count);
				}
				else
					map.put(c,1);
			}
			Iterator it = map.entrySet().iterator();
			int f=0;
			while(it.hasNext()){
				Map.Entry pair = (Map.Entry)it.next();
				if((int)pair.getValue()==1){
					System.out.println("NO");
					f=1;
					break;
				}
			}
			if(f==0){
			if(under!=0)
				System.out.println("YES");
			else{
				int i=0;
				for(i=1;i<b.length()-1;i++){
					if(b.charAt(i-1)!=b.charAt(i)&&b.charAt(i)!=b.charAt(i+1)){
						System.out.println("NO");
						break;
					}
				}
				if(i==b.length()-1)
					System.out.println("YES");
			}
			}
        }
    }
}

