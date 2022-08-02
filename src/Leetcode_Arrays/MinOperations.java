package Leetcode_Arrays;

public class MinOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,5,2,4,1};
System.out.println(minperations(nums));
	}

	private static int minperations(int[] nums) {
		// TODO Auto-generated method stub
		   int result=0;
		      for(int i=1;i<nums.length;i++)
		      {
		          if(nums[i]<=nums[i-1])
		          {
		              int difference=nums[i-1]-nums[i]+1;
		              result+=difference;
		              nums[i]=nums[i]+difference;
		              
		          }
		      }return result;
	}

}
