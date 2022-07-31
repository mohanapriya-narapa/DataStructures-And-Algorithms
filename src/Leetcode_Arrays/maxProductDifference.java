package Leetcode_Arrays;

import java.util.Arrays;

public class maxProductDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {5,6,2,7,4};
System.out.println(maxProductDifference(nums));
 	}

	private static int maxProductDifference(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
        int max=nums[nums.length-2]*nums[nums.length-1];
           int min=nums[0]*nums[1];
        return max-min;
	}

}
