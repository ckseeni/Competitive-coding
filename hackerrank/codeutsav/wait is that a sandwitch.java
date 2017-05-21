import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Interval{
    int sum = 0;
    int up = 0;
	int down = 0;
}
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			int k = in.nextInt();
			int up[] = new int[n];
			int down[] = new int[n];
			for(int i=0;i<n;i++)
				up[i] = in.nextInt();
			for(int i=0;i<n;i++)
				down[i] = in.nextInt();
			ArrayList<Interval> arr = new ArrayList<Interval>();
			for(int i=0;i<n;i++){
				Interval interval = new Interval();
				interval.sum = up[i] + down[i];
				interval.up = up[i];
				interval.down = down[i];
				arr.add(interval);
			}
			Collections.sort(arr,new Comparator<Interval>(){
		        @Override
		        public int compare(Interval a,Interval b){
					if(a.sum<b.sum)
						return 1;
					else if(a.sum==b.sum){
						if(a.up<b.up)
							return 1;
						else if(a.up>b.up)
							return -1;
						else
							return 0;
					}
					return -1;
		        }
		    });
			int d = 0;
			/*for(int i=0;i<arr.size();i++){
				System.out.println(arr.get(i).sum+" "+arr.get(i).up+" "+arr.get(i).down);
			}*/	
			for(int i=0;i<k;i++){
				
				d = d + arr.get(i).up;
				//System.out.println("\n"+arr.get(i).up+"up"+d);
			}
			for(int i=k;i<n;i++){
				d = d - arr.get(i).down;
				//System.out.println("\n"+arr.get(i).down+"down"+d);	
			}
			System.out.println(d);
			t--;
		}
    }
}
