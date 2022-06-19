package Backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates= {10,1,2,7,6,5};
List<List<Integer>> res=generateCombinations(candidates, 8);
for(List<Integer> res1:res)
{
	for(int x:res1)
	{
		System.out.println(x);
	}
	System.out.println(" ");
}
	}

	private static List<List<Integer>> generateCombinations(int[] candidates , int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> res=new LinkedList<>();
		if(candidates==null || candidates.length==0 || target<0)
		{
			return res;
		}
		Arrays.sort(candidates);
		int start =0;
		backtrack(res,candidates,target,start,new LinkedList<>());
		return res;
		}

	private static void backtrack(List<List<Integer>> res, int[] candidates, int target, int start,
			LinkedList<Integer> combination) {
		// TODO Auto-generated method stub
		if(target==0)
		{
			res.add(new LinkedList<>(combination));		
		}
		else if(target>0)
		{
			for(int i=start;i<candidates.length;i++)
			{if(target<candidates[i])
			{
				return;
			}
				combination.add(candidates[i]);
				backtrack(res,candidates, target-candidates[i],start+1,combination);
				combination.remove(combination.size()-1);
			}
		}
		
	}

}
