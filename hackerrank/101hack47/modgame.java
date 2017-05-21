import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[p];
        for(int a_i=0; a_i < p; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[q];
        for(int b_i=0; b_i < q; b_i++){
            b[b_i] = in.nextInt();
        }
        ArrayList<Integer> sum = new ArrayList<Integer>();
		HashSet<Integer> h = new HashSet<Integer>();
		HashMap<Integer,Integer> ha = new HashMap<Integer,Integer>();
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                int s = (a[i]+b[j])%n;
				if(!h.contains(s)){
                	sum.add(s);
					h.add(s);
					ha.put(s,1);
				}
				else{
					int c = ha.get(s);
					ha.put(s,c+1);
				}
            }
        }
		int f=0;
		int c[] = new int[n+1];
        for(int i=1;i<=n;i++){
            int j=0;
            for(j=0;j<sum.size();j++){
                if((sum.get(j)+i)%n==0)
                    c[i] = ha.get(sum.get(j));
            }    
        }
		int min = Integer.MAX_VALUE,mini=n;
		for(int i=1;i<=n;i++){
			if(min>c[i]){
				min = c[i];
				mini = i;
			}
		}
		System.out.println(mini);
    }
}

