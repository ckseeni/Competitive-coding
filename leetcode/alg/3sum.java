import java.io.*;
import java.util.*;
public class Lee{
	public static void main(String args[]){
		int prices[] = {12,-14,-5,12,-2,9,0,9,-3,-3,-14,-6,-4,13,-11,-8,0,5,-7,-6,-10,-13,-7,-14,-3,0,12,5,-8,7,3,-11,0,6,9,13,-8,-6,7,4,6,0,13,-13,-1,9,-13,6,-1,-13,-15,-4,-11,-15,-11,-7,1,-14,13,8,0,2,4,-15,-15,-2,5,-8,7,-11,11,-10,4,1,-15,10,-5,-13,2,1,11,-6,4,-15,-5,8,-7,3,1,-9,-4,-14,0,-15,8,0,-1,-2,7,13,2,-5,11,13,11,11};
		threeSum(prices);
	}
	public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> a = new  ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
			if(i==0||(i>0&&nums[i]!=nums[i-1])){
				int j = i+1;
				int k = nums.length-1;
				int sum = 0 - nums[i];
				while(j<k){
					if(nums[j]+nums[k]==sum){
						a.add(Arrays.asList(nums[i],nums[j],nums[k]));
						while(j<k&&nums[j]==nums[j+1]) j++;
						while(j<k&&nums[k]==nums[k-1]) k--;
						j++;
						k--;
					}
					else if(nums[j]+nums[k]<sum)
						j++;
					else
						k--;
				}
			}
		}   
		//System.out.println(a);
		return a;
    }
    
}
