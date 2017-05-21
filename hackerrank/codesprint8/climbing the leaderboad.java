import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();

	public static int binarySearch(int alice,int scores[]){
		int i=0,j=scores.length-1;
		while(i<j){
			int mid = (i+j)/2;
			if(alice<scores[mid])
				i=mid+1;
			else if(alice>scores[mid])
				j=mid;	
			else if(alice==scores[mid])
				return h.get(scores[mid]);
		}
		if(i>=0&&i<scores.length){
			if(scores[i]>alice)
				return h.get(scores[i])+1;
			else
				return h.get(scores[i]);
		}
		else{
			if(i==scores.length)
				return h.get(scores[i-1])+1;
			if(i<0)
				return 1;
		}
		return 0;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
		int c = 1;
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
			if(!h.containsKey(scores[scores_i])){
				h.put(scores[scores_i],c);
				c++;
			}
        }
		//System.out.println(h);
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
			int rank = binarySearch(alice[alice_i],scores);
			System.out.println(rank);
        }
		
        // your code goes here
    }
}

