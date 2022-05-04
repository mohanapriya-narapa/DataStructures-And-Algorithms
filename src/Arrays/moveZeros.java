package Arrays;

public class moveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {0,1,0,3,12};
		int track=0;
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0)
			{
				count++;
			}
		}
		for(int i=0;i<nums.length;i++)
		{
if(nums[i]!=0)
{
	nums[track++]=nums[i];
}
		}
for(int j=0;j<count;j++)
{
	nums[track++]=0;
}
	for(int x:nums)
	{
		System.out.println(x);
	}
			

	}

}
