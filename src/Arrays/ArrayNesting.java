package Arrays;

public class ArrayNesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {5,4,0,3,1,6,2};
System.out.println(ArrayNesting(nums));
	}

	private static int ArrayNesting(int[] nums) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i=0;i<nums.length;i++)
		{
			int j=0,count=0;
			while(nums[j]!=-1)
			{
				int next=nums[j];
				nums[j]=-1;
				j=next;
				count++;
			}
			result=Math.max(result,count);
		}
		return result;
	}

}
