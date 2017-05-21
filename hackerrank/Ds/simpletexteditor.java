import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Stack{
	char arr[] = new char[10000000];
	int top;
	void push(char x){
		top++;
		arr[top]=x;
	}
	char pop(){
		char p = arr[top];
		arr[top]='\0';
		top--;
		return p;
	}
	int isEmpty(){
		if(top==-1)
			return 1;
		else
			return 0;
	}
}

class Stackop{
	int arr[] = new int[10000000];
	int top;
	void push(int x){
		top++;
		arr[top]=x;
	}
	int pop(){
		int p = arr[top];
		top--;
		return p;
	}
	int isEmpty(){
		if(top==-1)
			return 1;
		else
			return 0;
	}
}

class Stackstring{
	String arr[] = new String[10000000];
	int top;
	void push(String x){
		top++;
		arr[top]=x;
	}
	String pop(){
		String p = arr[top];
		top--;
		return p;
	}
	int isEmpty(){
		if(top==-1)
			return 1;
		else
			return 0;
	}
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    	Stack s = new Stack();
		int n = in.nextInt();
		Stackop sop = new Stackop();
		Stackstring sstring = new Stackstring();
		s.top=-1;
		sop.top=-1;
		sstring.top=-1;
		while(n>0){
			int op = in.nextInt();
			if(op==1){
				String inp = in.next();
				for(int i=0;i<inp.length();i++)
					s.push(inp.charAt(i));
				sop.push(op);
				sstring.push(inp);
			}
			if(op==2){
				int k = in.nextInt();
				char poped[] = new char[k];
				int j = 0;
				for(int i=0;i<k;i++){
					poped[j]=s.pop();
					j++;
				}
				sop.push(op);
				String popedstring = new String(poped);
				StringBuilder inp1 = new StringBuilder();
				inp1.append(popedstring);
				inp1=inp1.reverse();
				popedstring = new String(inp1);
				sstring.push(popedstring);
			}
			if(op==3){
				int k = in.nextInt();
				System.out.println(s.arr[k-1]);
			}
			if(op==4){
				int preop = sop.pop();
				if(preop==1){
					String prestring = sstring.pop();
					for(int i=0;i<prestring.length();i++)
						s.pop();
				}
				if(preop==2){
					String prestring = sstring.pop();
					for(int i=0;i<prestring.length();i++)
						s.push(prestring.charAt(i));
				}
			}
			n--;
		}
    }
}

