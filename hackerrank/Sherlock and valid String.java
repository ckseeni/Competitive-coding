import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String s = in.next();
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			if(h.containsKey(s.charAt(i))){
				int c = h.get(s.charAt(i));
				c++;
				h.put(s.charAt(i),c);
			}
			else
				h.put(s.charAt(i),1);
		}
		int arr[] = new int[27];
		int k=0;
		HashSet<Integer> ha = new HashSet<Integer>(); 
		for(Map.Entry<Character,Integer> entry : h.entrySet()){
			arr[k]=(int)entry.getValue();
			ha.add((int)entry.getValue());
			k++;
		}
		System.out.println(h);
		System.out.println(k);
		int first = arr[0];
		int flag=1,removal=0,otherdiff=0;
		for(int i=1;i<k;i++){
			if(arr[i]!=first)
				flag=0;
		}
		if(flag==1)
			System.out.println("YES");
		else{
			for(int i=0;i<k-1;i++){
				if(arr[i]!=arr[i+1]){
					if(arr[i]==1||arr[i+1]==1){
						removal++;
						if(arr[i]==1)
							arr[i]=0;
						else
							arr[i+1]=0;
					}
					else{
						int diff = Math.abs(arr[i]-arr[i+1]);
						if(arr[i]>arr[i+1])
							arr[i]=arr[i]-diff;
						else
							arr[i+1]=arr[i+1]-diff;
						if(diff==1)
							removal++;
						else
							otherdiff++;
					}	
				}
			}
			if(removal==1&&otherdiff==0){
				System.out.println("adf");
				for(int i=0;i<k;i++){
					System.out.print(arr[i]+" ");				
					if(arr[i]!=0){
						first=arr[i];
						//break;
					}
				}
				flag=1;
				for(int i=1;i<k;i++){
					if(arr[i]!=0&&arr[i]!=first)
						flag=0;
				}
				if(flag==0)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
    }
}
