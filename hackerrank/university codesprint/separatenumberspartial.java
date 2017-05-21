import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            if(s.length()==1){
                System.out.println("NO");
                continue;
            }
			int f = 1;
			int n=0;
			if(s.length()%2==1)
				n = (s.length()/2)+1;
			else
				n = s.length()/2; 
            for(int i=1;i<=n;i++){
				int c = 0;
                int j = 0;
				ArrayList<Long> arr = new ArrayList<Long>();
				int z = 0;
                for(j=s.length()-1;j>=0;j=j-i){
					
					StringBuffer buf = new StringBuffer();
					buf.append("1");
					for(int l=0;l<i-1;l++)
						buf.append("0");
					String b = buf.toString();
					//System.out.println("j  "+j);
					if(j-i>=0){
		                String x = s.substring(j-i+1,j+1-c);
						if(i>1&&x.equals(b)){
								c=i-1;		
						}
						if(i>1&&x.charAt(0)=='0'){
							z=1;
							break;
						}
		                Long ele = Long.parseLong(x);
						arr.add(ele);
						System.out.println("ele  " + x);
					}
                } 
				if(z==1)
					continue; 
				
				System.out.println("as "+s.substring(0,j+i+1)); 
				String x = s.substring(0,j+i+1);
		        Long ele = Long.parseLong(x);
				arr.add(ele);
				f = 1;
				for(int k=arr.size()-1;k>=1;k--){
					long o = arr.get(k);
					long t = arr.get(k-1);
					if(o-t!=-1){
						f=0;
						break;
					}
				}
				if(f==1){
					Collections.sort(arr);
					System.out.println("YES "+arr.get(0));
					break;
				}		
            }
			if(f==0)
				System.out.println("NO");
        }    
    }
}

