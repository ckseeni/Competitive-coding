import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long k = in.nextLong();
		long c = 0;
		ArrayList<Long> arr = new ArrayList<Long>();
		HashSet<Long> h = new HashSet<Long>();
		for(long i=1;i<=(long)Math.sqrt(n)+1;i++){
			if(n%i==0){
				if(!h.contains(i)){
					if(n/i!=i){
						arr.add(i);
						arr.add(n/i);
						h.add(i);
						h.add(n/i);
					}	
					else{
						arr.add(i);
						h.add(i);
					}
				}
			}
		}
		//System.out.println(arr);
		if(k>arr.size()){
			System.out.println("-1");
			return;
		}
		Collections.sort(arr);
		System.out.println(arr.get((int)k-1));
	}
}     

