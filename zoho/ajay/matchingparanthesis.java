import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Stack{
	char arr[] = new char[100000];
	int top = -1;
	void push(char x){
		top++;
		arr[top]=x;
	}
	char pop(){
		char p = arr[top];
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
     	String s = in.next();
		Stack stack = new Stack();
		int count = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==')'&&(stack.isEmpty()==0)){
				stack.pop();
				count = count + 2;
			}
			if(s.charAt(i)=='(')	
				stack.push('(');
		}
		System.out.println(count);
	}
}

