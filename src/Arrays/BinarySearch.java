package Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {-1,0,3,5,9,12};
int target=3;
System.out.println(binarySearch(nums,target));
	}

	private static int binarySearch(int[] nums, int target) {
		int low=0;int high=nums.length-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(nums[mid]==target)
{
				return mid;
}
			else if(nums[mid]<target)
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		return -1;
		
	}

}
