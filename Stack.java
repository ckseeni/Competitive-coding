import java.util.Scanner;
class stackclass{
	int top;
	int arr[] = new int[100];
}
public class Stack {
	private static stackclass st = new stackclass();
	public static void main(String args[]){
		st.top=0;
		push();
		pop();
	}
	public static void push(){
		System.out.println("enter elements to push -1 to end");
		int i;
		Scanner in = new Scanner(System.in);
		i=in.nextInt();
		while(i!=-1){
			st.arr[st.top]=i;
			st.top++;
			i = in.nextInt();
		}
		in.close();
		return;
	}
	public static void pop(){
		while(st.top!=-1){
			st.top--;
			System.out.println(st.arr[st.top]);
			System.out.println(st.top);
		}
	}
}
