package Arrays;

public class productArrayExceptItself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,2,3,4};
		int[] res=productSum(nums);
		for(int x:res)
		{
System.out.println(x);
		}
	}

	private static int[] productSum(int[] nums) {
		// TODO Auto-generated method stub
		int[] left=new int[nums.length];
		int[] right=new int[nums.length];
		int[] result=new int[nums.length];
		left[0]=1;
		right[nums.length-1]=1;
		for(int i=1;i<nums.length;i++)
		{
			left[i]=left[i-1]*nums[i-1];
		}
		for(int i=nums.length-2;i>=0;i--)
		{
			right[i]=right[i+1]*nums[i+1];
		}
		for(int i=0;i<nums.length;i++)
		{
			result[i]=left[i]*nums[i];
		}
		return result;
	}

}
