package Arrays;

public class searchInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,3,5,6};
int target=5;
int result=insertPosition(arr,target);
System.out.println(result);
	}

	private static int insertPosition(int[] arr, int target) {
		int low=0;
		int high=arr.length;int mid=0;
		while(low<high)
		{
			mid=(low+high)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(target<arr[mid])
			{
				high=mid;
			}
			else if(target>arr[mid])
			{
				low=mid+1;
			}
		}return low;
	}

}
