package Arrays;

public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {3,2,2,3};
		int val=3;
		int i=0;
		for(int j=0;j<nums.length;j++)
		{
			if(nums[j]!=val)
			{
				nums[i++]=nums[j];
			}
		}
		System.out.println(i);

	}

}
