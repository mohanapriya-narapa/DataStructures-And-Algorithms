package Arrays;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]=new int[] {1,2,3,4,5,6,7};
rotateArray(nums,3);
for(int x:nums) {
System.out.println(x);
}
	}

	private static void rotateArray(int[] nums,int k) {
		// TODO Auto-generated method stub
	k=k%nums.length;
	swap(nums,0,nums.length-1);
	swap(nums,0,k-1);
	swap(nums,k,nums.length-1);
	}

	private static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j)
		{
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		i++;
		j--;
		}
	}

}
