package linkedList;

public class reverse {
public static class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node first=new Node(1);
Node second=new Node(2);
Node third=new Node(3);
Node fourth=new Node(4);
Node fifth=new Node(5);
first.next=second;
second.next=third;
third.next=fourth;
fourth.next=fifth;
print(reverseList(first));
	}
	private static void print(Node head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	private static Node reverseList(Node first) {
		// TODO Auto-generated method stub
		Node cur=first;
		Node prev=null;
		while(cur!=null)
		{
			Node next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}return prev;
		
	}

}
