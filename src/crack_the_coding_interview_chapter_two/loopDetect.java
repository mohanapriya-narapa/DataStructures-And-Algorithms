package crack_the_coding_interview_chapter_two;

public class loopDetect {
	private static class Node
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
first.next=second;
second.next=third;
third.next=fourth;
fourth.next=first;
System.out.println(loopDetect(first));
	}

	private static boolean loopDetect(Node first) {
		// TODO Auto-generated method stub
		if(first==null || first.next==null)
		{
			return false;
		}
Node slow=first;
Node fast=first.next;
while(slow!=fast)
{
	if(fast.next==null || fast.next.next==null)
	{
		return false;
	}
	slow=slow.next;
	fast=fast.next.next;
}return true;
	}

}
