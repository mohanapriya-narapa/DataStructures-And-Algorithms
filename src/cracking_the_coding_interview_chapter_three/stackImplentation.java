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
push(5,0);push(8,1);push(9,2);
pop(1);

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
		heads[stacknum]++;
		int offset=arrayOffset(stacknum)+heads[stacknum];
		arr[offset]=i;
		
	}

}
