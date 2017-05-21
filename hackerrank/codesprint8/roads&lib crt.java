import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static int root(int num,int city[]){
		while(city[num]!=num)
			num=city[num];
		return num;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
			if(x<y){
				long r = (long)n*x;
				System.out.println(r);
				for(int a1 = 0; a1 < m; a1++){
                	int city_1 = in.nextInt();
                	int city_2 = in.nextInt();
				}
				continue;
			}
			int citycount[] = new int[n];
			int city[] = new int[n];
			for(int i=0;i<n;i++){
				citycount[i]=1;
				city[i]=i;
			}
			/*for(int i=0;i<n;i++)
				System.out.print(city[i]+" ");
			System.out.println();
			for(int i=0;i<n;i++)
				System.out.print(citycount[i]+" ");
			System.out.println();*/
			HashSet<Integer> h = new HashSet<Integer>();
            for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
				city_1 = city_1 -1;
				city_2 = city_2 -1;
				h.add(city_1);
				h.add(city_2);
				int root1 = root(city_1,city);
				int root2 = root(city_2,city);
				if(root1<root2){
					city[root2]=root1;
					citycount[root1] = citycount[root1]+citycount[root2];
					citycount[root2] = -1;
				}
				if(root1>root2){
					city[root1]=root2;
					citycount[root2] = citycount[root2]+citycount[root1];
					citycount[root1] = -1;
				}
				/*for(int i=0;i<n;i++)
					System.out.print(city[i]+" ");
				System.out.println();
				for(int i=0;i<n;i++)
					System.out.print(citycount[i]+" ");
				System.out.println();*/

            }
			/*for(int i=0;i<n;i++)
				System.out.print(city[i]+" ");
			System.out.println();
			for(int i=0;i<n;i++)
				System.out.print(citycount[i]+" ");
			System.out.println();*/
			BigInteger c = BigInteger.valueOf(0);
			for(int i=0;i<n;i++){
				if(citycount[i]!=-1){
					//c = c + x + ((citycount[i]-1)*y);
					BigInteger xb = BigInteger.valueOf(x);
					BigInteger v = BigInteger.valueOf(((citycount[i]-1)*y));
					xb = xb.add(v);
					c = c.add(xb);
				}
			}
			System.out.println(c);
        }
    }
}

