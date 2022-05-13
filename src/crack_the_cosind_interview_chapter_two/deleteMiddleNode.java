package crack_the_cosind_interview_chapter_two;

public class deleteMiddleNode {
public static class Listnode{
		
		private int data;
		private Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listnode head=new Listnode(10);
		Listnode first=new Listnode(11);
		Listnode second=new Listnode(12);
		Listnode third=new Listnode(12);
		head.next=first;
		first.next=second;
		second.next=third;
deleteMiddleNode(second);
print(head);
	}
	private static void print(Listnode head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{System.out.println(head.data);
			head=head.next;
		}
	}
	private static void deleteMiddleNode(Listnode n) {
		// TODO Auto-generated method stub
	Listnode next=n.next;
		n.data=next.data;
		n.next=next.next;
		
	}

}
