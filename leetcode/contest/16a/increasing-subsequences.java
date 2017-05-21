import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 public static HashSet<List<Integer>> h = new HashSet<List<Integer>>();
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int nums[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		res = findSubsequences(nums);
		for(List<Integer> x:res){
		    //res.add(x);
			System.out.println(x);
		}
    }
  
    public static void subset(int[] A,int k,int start,int currLen,boolean[] used) {
		if(currLen==k) {
			StringBuffer s = new StringBuffer();
			for(int i=0; i<A.length; i++) {
				if(used[i]==true) {
					//System.out.print(A[i]+"");
					s.append(A[i]);
				}
			}
			String ss = s.toString();
		    List<Integer> arr = new ArrayList<Integer>();
		    for(int i=0;i<ss.length();i++)
		        arr.add((int)ss.charAt(i)-48);
		    int i=0;
		    for(i=0;i<arr.size()-1;i++){
		        if(arr.get(i)>arr.get(i+1))
		            break;
		    }
		    if(i==arr.size()-1){
		    if(!h.contains(arr))
		        h.add(arr);
		    }
			return;
		}
		if(start==A.length) {
			return;
		}
		//For every index we have two options,//1.. Either we select it, means put true in used[] and make currLen+1
		used[start]=true;
		subset(A, k, start+1, currLen+1, used);
		//2.. OR we dont select it, means put false in used[] and dont increase//currLen
		used[start]=false;
		subset(A, k, start+1, currLen, used);
	}
    public static List<List<Integer>> findSubsequences(int[] nums) {
        h.clear();
        boolean[] B=new boolean[nums.length];
		for(int i=2;i<=nums.length;i++)
		    subset(nums,i,0,0,B);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(List<Integer> x:h)
		    res.add(x);
		
		return res;
    }


}

