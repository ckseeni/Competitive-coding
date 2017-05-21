import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		for(int i=0;i<inputString.length();i++){
			if(h.containsKey(inputString.charAt(i))){
				int c = h.get(inputString.charAt(i));
				c++;
				h.put(inputString.charAt(i),c);
			}
			else
				h.put(inputString.charAt(i),1);
		}
		int odd=0,even=0;
		for(Integer x : h.values()){
			if(x%2==0)
				even++;
			else
				odd++;
		}
		if(odd==0||odd==1)
			System.out.println("YES");
		else
			System.out.println("NO");
        myScan.close();
    }
}

