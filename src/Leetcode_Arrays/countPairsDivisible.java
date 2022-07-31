package Leetcode_Arrays;

public class countPairsDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {3,1,2,2,2,1,3};
System.out.println(countPairs(arr,2));
 	}

	private static int countPairs(int[] nums, int k) {
		// TODO Auto-generated method stub
		  int count=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	                if((nums[i]==nums[j]) && ((i*j)%k==0))
	                {
	                    count++;
	                }
	            }
	        }
	        return count;
	}

}
