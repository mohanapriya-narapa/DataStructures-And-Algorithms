package slidingWindow;

public class maximumAverageSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,12,-5,-6,50,3};
System.out.println(maxAvergaeSubArray(nums, 4));
	}

	private static int maxAvergaeSubArray(int[] nums, int k) {
		// TODO Auto-generated method stub
int sum=0;
for(int i=0;i<k;i++)
{
	sum+=nums[i];
}int res=sum;
for(int i=k;i<nums.length;i++)
{
	sum=sum+nums[i]-nums[i-k];
	res=Math.max(res,sum);
}return res/k;
	}

}
