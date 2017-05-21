import java.io.*;
import java.util.*;
public class Solution{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		HashSet<String> h = new HashSet<String>();
 		for(int i=0;i<s.length();i++){
			for(int j=i;j<s.length();j++){
				String arr = s.substring(i,j+1);
				//System.out.println(arr);
				h.add(arr);
			}
		}
		System.out.println(h.size());
	}
}
