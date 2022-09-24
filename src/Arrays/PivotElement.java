package Arrays;

public class PivotElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {9,12,5,10,14,3,10};
int pivot=10;
int[] result=pivotArray(nums, 10);
for(int x:result)
{
	System.out.println(x);
}
	}

	private static int[] pivotArray(int[] nums, int pivot) {
		// TODO Auto-generated method stub
		 int[] temp=new int[nums.length];
	        int k=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]<pivot)
	            {
	                temp[k]=nums[i];
	                k++;
	            }
	        }
	          for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]==pivot)
	            {
	                temp[k]=nums[i];
	                k++;
	            }
	        }
	             for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]>pivot)
	            {
	                temp[k]=nums[i];
	                k++;
	            }
	        }
	        return temp;
	}

}
