import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Stack{
	char arr[] = new char[10000];
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
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
			Stack st = new Stack();
			int i = 0;
			for(i=0;i<s.length();i++){
				char c;
				if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
					st.push(s.charAt(i));
				if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'){
					if(st.isEmpty()==1){
						System.out.println("NO");
						break;
					}
					else{
						c=st.pop();
						if(s.charAt(i)=='}'&&c!='{'){
							System.out.println("NO");
							break;
						}
						if(s.charAt(i)==')'&&c!='('){
							System.out.println("NO");
							break;
						}
						if(s.charAt(i)==']'&&c!='['){
							System.out.println("NO");
							break;
						}
					}
				}
			}
			if(i==s.length()&&st.isEmpty()==1)
				System.out.println("YES");
			if(i==s.length()&&st.isEmpty()==0)
				System.out.println("NO");
        }
    }
}

