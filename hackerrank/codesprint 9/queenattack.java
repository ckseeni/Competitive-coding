import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Pos{
	int r=0;
	int c=0;
}
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
		int left = cQueen - 1;
		int right = n - cQueen;
		int top = n - rQueen;
		int bottom = rQueen - 1;
		int lbm = Math.min(left,bottom);
		int trm = Math.min(top,right);
		int ltm = Math.min(left,top);
		int rbm = Math.min(right,bottom);
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            // your code goes here
			Pos pos = new Pos();
			pos.r = rObstacle;
			pos.c = cObstacle;
			int diffr = rQueen - pos.r;
			int diffc = cQueen - pos.c;
			if(diffr==0&&diffc>0){
				int d = cQueen - pos.c - 1;
				int di = left -d;
				if(left-di>=0)
					left = left - di;
				System.out.println("left"+left);
			}
			else if(diffr==0&&diffc<0){
				int d = pos.c - cQueen - 1;
				int di = right -d;
				if(right-di>=0)
					right = right - di;
				System.out.println("right"+right);
			}
			else if(diffr<0&&diffc==0){
				int d =  pos.r - rQueen - 1;
				//if(top>d){
					int di = top -d;
					if(top-di>=0)
						top = top - di;
				//}
				System.out.println("top"+top);
			}
				
			else if(diffr>0&&diffc==0){
				int d = rQueen - pos.r - 1;
				int di = bottom -d;
				if(bottom-di>=0)
					bottom = bottom - di;
				System.out.println("bottom"+bottom);
			}
				
			else if(diffr>0&&diffc>0&&diffr==diffc){
				int d = rQueen - pos.r - 1;
				int di = lbm -d;
				if(lbm-di>=0)
					lbm = lbm - di;
				System.out.println("lbm"+lbm);
			}
			else if(diffr<0&&diffc<0&&diffr==diffc){
				int d = pos.r - rQueen - 1;
				int di = trm -d;
				if(trm-di>=0)
					trm = trm - di;
				System.out.println("trm"+trm);
			}
			else if(diffr<0&&diffc>0&&(diffr)==-(diffc)){
				int d = pos.r - rQueen - 1;
				int di = ltm -d;
				if(ltm-di>=0)
					ltm = ltm - di;
				System.out.println("ltm"+ltm);
			}
			else if(diffr>0&&diffc<0&&(diffr)==-(diffc)){
				int d = pos.c - cQueen - 1;
				int di = rbm -d;
				if(rbm-di>=0)
					rbm = rbm - di;
				System.out.println("rbm"+rbm);
			}
    	}
		System.out.println(left+right+top+bottom+lbm+trm+ltm+rbm);
    }
}

