import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Interval{
	int st = 0;
	int en = 0;
}
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] sizes = new int[n];
            for(int sizes_i=0; sizes_i < n; sizes_i++){
                sizes[sizes_i] = in.nextInt();
            }
			Arrays.sort(sizes);
            int v = in.nextInt();
			ArrayList<Interval> arr = new ArrayList<Interval>();
            for(int a1 = 0; a1 < v; a1++){
                int smallest = in.nextInt();
                int largest = in.nextInt();
				Interval interval = new Interval();
				interval.st = smallest;
				interval.en = largest;
                // your code goes here
				arr.add(interval);
            }
			Collections.sort(arr,new Comparator<Interval>(){
		        @Override
		        public int compare(Interval a,Interval b){
					if(a.st>b.st)
						return 1;
					else
						return -1;
		        }
		    });
			long c = 0;
			for(int i=0,j=0;i<n&&j<arr.size();){
				Interval interval = arr.get(j);
				if(sizes[i]>interval.en){
					j++;
					continue;	
				}
				if(sizes[i]>=interval.st&&sizes[i]<=interval.en){
					c++;
					i++;
					continue;
				}
				if(sizes[i]<interval.st){
					i++;
					continue;
				}
			}
			System.out.println(c);
        }
    }
}

