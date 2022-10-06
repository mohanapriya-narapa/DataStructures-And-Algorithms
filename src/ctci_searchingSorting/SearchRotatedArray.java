package ctci_searchingSorting;

public class SearchRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {4,5,6,7,0,1,2};
int result=searchRotatedArray(nums,0);
System.out.println(result);
	}

	private static int searchRotatedArray(int[] nums, int target) {
		// TODO Auto-generated method stub
	int start=0;
	int end=nums.length-1;
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(nums[mid]==target)
		{
			return mid;
		}
		if(nums[start]<=nums[mid])
		{
			if(nums[start]<=target && target<=nums[end] )
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		else if(nums[mid]<=nums[end])
		{
			if(nums[mid]<target && target<=nums[end])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		
			
	}return -1;
	}

}
