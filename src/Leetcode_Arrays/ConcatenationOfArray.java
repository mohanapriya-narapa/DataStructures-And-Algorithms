package Leetcode_Arrays;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[]  {1,2,1};
int[] res= ConcatenationOfArray(nums);
for(int x:res)
{
	System.out.println(x);
}
 	}
//leetcode
	private static int[] ConcatenationOfArray(int[] nums) {
		// TODO Auto-generated method stub
	int[] res=new int[nums.length*2];
	for(int i=0;i<nums.length;i++)
	{
		res[i]=nums[i];
		res[i+nums.length]=nums[i];
	}return res;
	}

}
