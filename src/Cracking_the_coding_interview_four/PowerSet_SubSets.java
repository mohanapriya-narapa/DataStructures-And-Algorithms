package Cracking_the_coding_interview_four;

import java.util.LinkedList;
import java.util.List;

public class PowerSet_SubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3};
System.out.println(subsets(arr));
	}

	private static List<List<Integer>> subsets(int[] arr) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> res=new LinkedList<List<Integer>>();
 generateSubsets(0, arr, new LinkedList<Integer>(), res);
 return res;
	}

	private static void generateSubsets(int index, int[] nums, LinkedList<Integer> current,
			List<List<Integer>> res) {
		// TODO Auto-generated method stub
		res.add(new LinkedList<>(current));
		for(int i=index;i<nums.length;i++)
		{
			current.add(nums[i]);
			generateSubsets(i+1, nums, current, res);
			current.remove(current.size()-1);
		}
	}

}
