package Leetcode_Arrays;

public class countKDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,2,2,1};
int k=1;
System.out.println(countKDifference(nums,k));
	}

	private static int countKDifference(int[] nums, int k) {
		// TODO Auto-generated method stub
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])==k)
                {
                    count++;
                }
            }
        }
       return count;
	}

}
