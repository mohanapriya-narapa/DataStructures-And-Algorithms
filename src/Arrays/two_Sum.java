package Arrays;

import java.util.HashMap;

public class two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {2,7,11,15};
int[] result=twoSum(nums, 9);
for(int x:result)
{
	System.out.println(x);
}
	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
int[] res=new int[2];
for(int i=0;i<nums.length;i++)
{
	if(hs.containsKey(nums[i]))
	{
		res[0]=i;
		res[i]=hs.get(nums[i]);
	}
	else
	{
		hs.put(target-nums[i],i);
	}
}return res;
	}

}
