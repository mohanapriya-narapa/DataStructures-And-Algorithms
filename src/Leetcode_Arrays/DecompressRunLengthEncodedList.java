package Leetcode_Arrays;

import java.util.LinkedList;
import java.util.List;

public class DecompressRunLengthEncodedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,2,3,4};
System.out.println(decompressRLElist(nums));
	}

	private static List<Integer> decompressRLElist(int[] nums) {
		// TODO Auto-generated method stub
		List<Integer> li=new LinkedList<Integer>();
		for(int i=0;i<nums.length-1;i++)
		{
			int freq=nums[i];
			int value=nums[i+1];
			for(int j=0;j< freq;j++)
			{
				li.add(value);
			}
			i=i+1;
		}
		return li;
	}

}
