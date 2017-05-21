import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Link{
	int a=0,b=0;
}

public class Solution {
	
	public static int root(int num,int individual[]){
		while(individual[num]!=num)
			num=individual[num];
		return num;
	}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
			BigInteger tot = BigInteger.valueOf(0);
            int n = in.nextInt();
            int m = in.nextInt();
			List<Link> arr = new ArrayList<Link>();
			List<Link> extra = new ArrayList<Link>();
            for(int a1 = 0; a1 < m; a1++){
                int x = in.nextInt();
                int y = in.nextInt();
                // your code goes here
				if(x>y){
					int te = x;
					x = y;
					y = te;
				}
				Link l = new Link();
				l.a=x;
				l.b=y;
				arr.add(l);
            }	
			/*Collections.sort(arr,new Comparator<Link>(){
		       @Override
		       public int compare(Link x,Link y){
		           return Integer.compare(x.a,y.a);
		       }    
		    });*/
			/*for(int i=0;i<arr.size();i++){
				Link l1 = arr.get(i);
				for(int j=i+1;j<arr.size();j++){
					Link l2 = arr.get(j);
					if(l1.a==l2.a||l1.a==l2.b||l1.b==l2.a||l1.b==l2.b){
						if(j==i+1)
							break;
						Link x = arr.get(i+1);
						Link y = arr.get(j);
						arr.remove(i+1);
						arr.remove(j-1);
						arr.add(i+1,y);
						arr.add(j,x);						
						break;
					}						
				}	
			}*/		
			//for(Link x:arr)
			//	System.out.println(x.a+" "+x.b);
			int individual[] = new int[n];
			int count[] = new int[n];
			for(int i=0;i<n;i++){
				individual[i]=i;
				count[i]=1;
			}
			int cc = 0;
			while(arr.size()!=0){
				for(Link x:arr){
					int one = x.a-1;
					int two = x.b-1;
					int root1 = root(one,individual);
					int root2 = root(two,individual);
					if((count[root1]!=1||count[root2]!=1)||cc==0){
						if(root1==root2){
							BigInteger c = BigInteger.valueOf(count[root1]);
							BigInteger c1 = BigInteger.valueOf(count[root1]-1);
							BigInteger c2 = c.multiply(c1);	
							tot = tot.add(c2);
						}	
						if(root1<root2){
							individual[root2]=root1;
							count[root1] = count[root1]+count[root2];
							count[root2] = -1;
							BigInteger c = BigInteger.valueOf(count[root1]);
							BigInteger c1 = BigInteger.valueOf(count[root1]-1);
							BigInteger c2 = c.multiply(c1);	
							tot = tot.add(c2);
						}
						if(root1>root2){
							individual[root1]=root2;
							count[root2] = count[root2]+count[root1];
							count[root1] = -1;
							BigInteger c = BigInteger.valueOf(count[root2]);
							BigInteger c1 = BigInteger.valueOf(count[root2]-1);
							BigInteger c2 = c.multiply(c1);	
							tot = tot.add(c2);
						}
						cc++;
					}
					else{
						extra.add(x);
					}
					for(int i=0;i<n;i++)
						System.out.print(individual[i]+" ");
					System.out.print("   ");
					for(int i=0;i<n;i++)
						System.out.print(count[i]+" ");
					System.out.println(tot);
					System.out.println();
				}
				if(arr.size()==extra.size()){
					Collections.sort(arr,new Comparator<Link>(){
					   @Override
					   public int compare(Link x,Link y){
						   return Integer.compare(x.a,y.a);
					   }    
					});
					Collections.sort(extra,new Comparator<Link>(){
					   @Override
					   public int compare(Link x,Link y){
						   return Integer.compare(x.a,y.a);
					   }    
					});
					if(arr.equals(extra)){
						BigInteger two = BigInteger.valueOf(2);
						for(Link x:extra)
							tot = tot.add(two);
						break;
					}
				}
				arr = new ArrayList<Link>(extra);
				for(Link x:arr)
					System.out.println(x.a+" "+x.b);
				extra.clear();
				cc=0;
			}
			System.out.println(tot);
        }
    }
}

