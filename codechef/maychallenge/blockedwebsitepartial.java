import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class chef {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
			ArrayList<String> p = new ArrayList<String>();
			ArrayList<String> m = new ArrayList<String>();
			while(t>0){
				char type = in.next().charAt(0);
				String s = in.next();
			
				if(type=='-')
					m.add(s);
				else
					p.add(s);
				t--;
			}
			ArrayList<String> prefix = new ArrayList<String>();
			HashSet<String> pre = new HashSet<String>();
			if(p.size()==0){
				System.out.println("-1");
				return;
			}		
			for(int i=0;i<m.size();i++){
				String c = m.get(i);
				StringBuffer buf = new StringBuffer();
				int f=0,k=0;
				while(f!=1&&k<c.length()){
					f=1;
					buf.append(c.charAt(k));
					String compare = buf.toString();
					for(int j=0;j<p.size();j++){
						if(k>=p.get(j).length()){
							f=0;
							continue;
						}
						String compare2 = p.get(j).substring(0,k+1);
						if(compare.equals(compare2)){
						//	System.out.println(compare2+"  for "+c);
							f=0;
							break;
						}
					}
					if(f==1){
						if(!pre.contains(compare)){
							prefix.add(compare);
							pre.add(compare);
						}
						break;
					}
					k++;
				}
				if(f!=1){
					System.out.println("-1");
					return;
				}
			}
			//System.out.println(prefix);
			System.out.println(prefix.size());
			Collections.sort(prefix);
			for(String ss:prefix)
				System.out.println(ss);
		
    }
}


