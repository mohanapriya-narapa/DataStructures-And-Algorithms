package Leetcode_Arrays;

public class NumbersSmallerThanCurrentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {8,1,2,2,3};
int[] res=smallerNumbersThanCurrent(nums);
for(int x:res)
{
	System.out.println(x);
}
	}

	private static int[] smallerNumbersThanCurrent(int[] nums) {
		// TODO Auto-generated method stub
		int[] res=new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			int count=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]>nums[j])
				{
					count++;
				}
			}
			res[i]=count;
		}
		return res;
	}

}
