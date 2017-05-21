import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Stack{
	long arr[] = new long[1000000];
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
	boolean isEmpty(){
		if(top==-1)
			return true;
		return false;
	}
	long peek(){
		long p = arr[top];
		return p;
	}
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		int q = in.nextInt();
		while(q>0){
			int op = in.nextInt();
			if(op==1){
				long x = in.nextLong();
				s1.push(x);	
				
			}
			else{  //copy the second stack only when its empty..this will avoid repeated pop and push//
				if(s2.isEmpty()){
					while(!s1.isEmpty())
						s2.push(s1.pop());
				}
				if(!s2.isEmpty()){
					if(op==2)
						s2.pop();
					if(op==3)
						System.out.println(s2.peek());
				}
			}
			q--;
		}
    }
}
