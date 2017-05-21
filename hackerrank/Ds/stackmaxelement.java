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
		Stack s = new Stack();
		long max = -1;
		int n = in.nextInt();
		while(n>0){
			int op = in.nextInt();
			if(op==1){
				long x = in.nextLong();
				if(max>=x)
					s.push(x);
				else{
					long pre = 2*x+max;
					s.push(pre);
					max=x;
				}
			}
			if(op==2){
				long ele = s.pop();
				if(ele>max)
					max=ele-2*max;	
			}
			if(op==3){
				System.out.println(max);
			}
			n--;
		}	
	}

}
