import java.util.Scanner;
class Linklist {
	int data;
	Linklist next;
	void set(int x){
		data = x;
	}
}
public class Link {
	public static Linklist head=null;
	public static void main(String args[])throws Exception{
		add();
		show();
	}
	public static void add(){
		int i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter data for the linked list: -1 to end");
		i=in.nextInt();
		Linklist curr=null;
		while(i!=-1){
			if(head==null){
				head = new Linklist();
				head.set(i);
				curr=head;
			}
			else{
				curr.next = new Linklist();
				curr.next.set(i);
				curr=curr.next;
			}
			i = in.nextInt();
		}
		in.close();	
		return;
	}
	public static void show(){
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}
}

