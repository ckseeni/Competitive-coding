import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
		int maxTopic=Integer.MIN_VALUE;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int res[] = new int[m];
				int c =0;
				for(int k=0;k<m;k++){
					if(topic[i].charAt(k)=='0'&&topic[j].charAt(k)=='0')
						res[k]=0;
					else
						res[k]=1;					
				}
				for(int k=0;k<m;k++){
					if(res[k]==1)
						c++;	
				}
				if(c>maxTopic)
					maxTopic=c;
			}
		}
		int maxTeam=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int res[] = new int[m];
				int c =0;
				for(int k=0;k<m;k++){
					if(topic[i].charAt(k)=='0'&&topic[j].charAt(k)=='0')
						res[k]=0;
					else
						res[k]=1;					
				}
				for(int k=0;k<m;k++){
					if(res[k]==1)
						c++;	
				}
				if(c==maxTopic)
					maxTeam++;
			}
		}
		System.out.println(maxTopic);
		System.out.println(maxTeam);
    }
}

