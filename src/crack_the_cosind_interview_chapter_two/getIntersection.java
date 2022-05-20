package crack_the_cosind_interview_chapter_two;

public class getIntersection {
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
Node first=new Node(10);
Node second=new Node(12);
Node third=new Node(13);
Node fourth=new Node(14);
Node fifth=new Node(15);
first.next=second;
second.next=third;
third.next=fourth;
fourth.next=fifth;
Node sixth=new Node(8);
Node seventh=new Node(14);
Node eigth=new Node(15);
sixth.next=seventh;
seventh.next=eigth;
Node result=getIntersectionNode(first,sixth);
System.out.println(result.data);
	}

	private static Node getIntersectionNode(Node first, Node second) {
		// TODO Auto-generated method stub
		int c1=getCount(first);
		int c2=getCount(second);
	if(c1>c2)
	{
		return getIntersection(c1-c2,first,second);
	}
	else
	{
		return getIntersection(c2-c1,second,first);
	}
	}

	private static Node getIntersection(int d, Node first, Node second) {
		// TODO Auto-generated method stub
		Node current1=first;
		Node current2=second;
		for(int i=0;i<d;i++)
		{
			current1=current1.next;
		}
		while(current1!=null && current2!=null)
		{
			if(current1.data==current2.data)
			{
				return current1;
			}
			current1=current1.next;
			current2=current2.next;
		}
		return null;
	}

	private static int getCount(Node first) {
		// TODO Auto-generated method stub
int count=0;
while(first!=null)
{
	count++;
	first=first.next;
}return count;
	}

}
