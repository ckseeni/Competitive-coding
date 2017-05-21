import java.io.*;
import java.util.*;

class Stack{
	long arr[] = new long[100000];
	int top = -1;
	void push(long x){
		top++;
		arr[top]=x;
	}
	long pop(){
		long p = arr[top];
		top--;
		return p;
	}
}

public class Solution{
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		while(g>0){
			int turn=0;
			Stack s = new Stack();
			long max = -1;
			int n = in.nextInt();
			for(int i=0;i<n;i++){
				long x = in.nextLong();
				if(max>=x)
					s.push(x);
				else{
					long pre = 2*x+max;
					s.push(pre);
					max=x;
				}
			}
			while(s.top!=-1){
				long ele = s.pop();
				if(ele>max){
					max=ele-2*max;
					turn++;
				}		
			}
			if(turn%2==1)
				System.out.println("BOB");
			else
				System.out.println("ANDY");
			g--;
		}	
	}

}
