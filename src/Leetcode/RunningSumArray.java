package Leetcode;

public class RunningSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[]  {1,2,3,4};
		int[] res= runningSumArray(nums);
		for(int x:res)
		{
			System.out.println(x);
		}

	}

	private static int[] runningSumArray(int[] nums) {
		// TODO Auto-generated method stub
	int sum=0;
	int[] res=new int[nums.length];
	for(int i=0;i<nums.length;i++)
	{
		sum+=nums[i];
		res[i]=sum;
	}
	return res;
	}

}
