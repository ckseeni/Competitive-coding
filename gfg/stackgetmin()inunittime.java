import java.io.*;
import java.util.*;

class Stack{
	int arr[] = new int [1000];
	int top = -1;
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
		return 0;
	}
}

public class Solution{
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Stack s = new Stack();
		int min = -1;
		while(true){
			int op = in.nextInt();
			if(op==1){
				int x = in.nextInt();
				if(s.isEmpty()==1){
					min=x;
					s.push(x);	
				}
				else{
					if(x>=min)
						s.push(x);
					else{
						int pre = 2*x - min;  //Encoded value for storing previous min value
						min=x;
						s.push(pre);
					}
				}
			}
			if(op==2){
				int y = s.pop();
				if(y<min){
					min=2*min-y;   //Retrieval min from the encoded value 
					System.out.println("poped "+y);					
				}
				else
					System.out.println(y);
			}
			if(op==3)
				return;
			if(s.isEmpty()==1)
				System.out.println("Empty");
			else
				System.out.println("min is "+min);
		}
	}

}
