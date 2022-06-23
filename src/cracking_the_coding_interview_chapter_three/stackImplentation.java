package cracking_the_coding_interview_chapter_three;

public class stackImplentation {
	public static int[] heads=new int[3];
	static int stacknum=3;static int stackSize=3;
	static int[] arr=new int[stacknum*stackSize];
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=-1;
		}
		// TODO Auto-generated method stub
push(5,0);push(8,1);System.out.println(pop(1));push(9,2);push(10,2);System.out.println(peek(2));System.out.println(empty(1));

	}

	private static boolean empty(int stacknum) {
		// TODO Auto-generated method stub
		if(heads[stacknum]==-1)
		{
			return true;
		}return false;
	}

	private static void push(int i, int stacknum) {
		// TODO Auto-generated method stub
		heads[stacknum]++;
		int offset=arrayOffset(stacknum)+heads[stacknum];
		arr[offset]=i;
		
	}

	private static int arrayOffset(int stacknum) {
		// TODO Auto-generated method stub
		return stacknum*stackSize;
	}
	private static int pop(int stacknum) {
		// TODO Auto-generated method stub
		if(heads[stacknum]==-1)
		{
			return -1;
		}
		int offset=arrayOffset(stacknum)+heads[stacknum];
		heads[stacknum]--;
		return arr[offset];
		
	}
	private static int peek(int stacknum) {
		// TODO Auto-generated method stub
		int offset=arrayOffset(stacknum)+heads[stacknum];
		return arr[offset];
		
	}
}
