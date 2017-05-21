import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int om[][],firstrot[][],secondrot[][],thirdrot[][],n;
	public static int f=0,s=0,t=0;

	public static void firstrotation(){
		int rot=1;
		while(rot<=n/2){
			int i = rot,j=rot;
			for(;j<=n-rot+1;j++)
				firstrot[j][n-i+1] = om[i][j];
			i = rot;j= rot;
			for(;j<=n-rot+1;j++)
				firstrot[n-i+1][n-j+1] = om[j][n-i+1];
			i = rot;j=rot;
			for(;j<=n-rot;j++)
				firstrot[n-j+1][i] = om[n-i+1][n-j+1];	
			i=rot;j=rot;
			for(;j<=n-rot;j++)
				firstrot[i][j] = om[n-j+1][i];	
			rot++;
		}
		if(n%2!=0)
			firstrot[rot][rot] = om[rot][rot];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(om[i][j]!=firstrot[i][j])
					f++;
			}
		}	
		/*System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
				System.out.print(firstrot[i][j]+" ");
			System.out.println();
		}*/
	}
	public static void secondrotation(){
		int rot=1;
		while(rot<=n/2){
			int i = rot,j=rot;
			for(;j<=n-rot+1;j++)
				secondrot[j][n-i+1] = firstrot[i][j];
			i = rot;j= rot;
			for(;j<=n-rot+1;j++)
				secondrot[n-i+1][n-j+1] = firstrot[j][n-i+1];
			i = rot;j=rot;
			for(;j<=n-rot;j++)
				secondrot[n-j+1][i] = firstrot[n-i+1][n-j+1];	
			i=rot;j=rot;
			for(;j<=n-rot;j++)
				secondrot[i][j] = firstrot[n-j+1][i];	
			rot++;
		}
		if(n%2!=0)
			secondrot[rot][rot] = om[rot][rot];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(om[i][j]!=secondrot[i][j])
					s++;
			}
		}
		/*System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
				System.out.print(secondrot[i][j]+" ");
			System.out.println();
		}*/
	}
	public static void thirdrotation(){
		int rot=1;
		while(rot<=n/2){
			int i = rot,j=rot;
			for(;j<=n-rot+1;j++)
				thirdrot[j][n-i+1] = secondrot[i][j];
			i = rot;j= rot;
			for(;j<=n-rot+1;j++)
				thirdrot[n-i+1][n-j+1] = secondrot[j][n-i+1];
			i = rot;j=rot;
			for(;j<=n-rot;j++)
				thirdrot[n-j+1][i] = secondrot[n-i+1][n-j+1];	
			i=rot;j=rot;
			for(;j<=n-rot;j++)
				thirdrot[i][j] = secondrot[n-j+1][i];	
			rot++;
		}
		if(n%2!=0)
			thirdrot[rot][rot] = om[rot][rot];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(om[i][j]!=thirdrot[i][j])
					t++;
			}
		}
		
		/*System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
				System.out.print(thirdrot[i][j]+" ");
			System.out.println();
		}*/
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
		om = new int[n+1][n+1];
		firstrot = new int[n+1][n+1];
		secondrot = new int[n+1][n+1];
		thirdrot = new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				long sq = (long)Math.pow(i*j,2);
				long re = sq%7;
				if(re==0||re==1||re==3||re==6)
					om[i][j] = 1;
				else if(re==2||re==4||re==5)
					om[i][j] = 0;	
			}
		}
	/*	for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
				System.out.print(om[i][j]+" ");
			System.out.println();
		}*/
		firstrotation();
		secondrotation();
		thirdrotation();
      	int q = in.nextInt();
		while(q>0){
			int angle = in.nextInt();
			int c = angle%360;
			if(c==0)
				System.out.println("0");
			if(c==90)
				System.out.println(f);
			if(c==180)
				System.out.println(s);	
			if(c==270)
				System.out.println(t);
			q--;
		}	
    }
}

