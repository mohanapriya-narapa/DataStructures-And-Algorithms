package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {-1,0,1,2,-1,-4};
List<List<Integer>> res=threesum(nums);
System.out.println(res);
	}

	private static List<List<Integer>> threesum(int[] nums) {
		// TODO Auto-generated method stub
	Arrays.sort(nums);
	List<List<Integer>> li=new LinkedList<>();
	HashSet<List<Integer>> hs=new HashSet<List<Integer>>();
	for(int i=1;i<nums.length;i++)
	{
		int l=i;
		int r=nums.length-1;
		int x=nums[i-1];
		while(l<r)
		{
			if(x+nums[l]+nums[r]==0)
			{
				List<Integer> linew=new LinkedList<Integer>();
				linew.add(x);
				linew.add(nums[l]);
				linew.add(nums[r]);
				hs.add(linew);
				l++;
				r--;
				
			}
			else if(x+nums[l]+nums[r]<0)
			{
				l++;
			}
			else
			{
				r--;
			}
		}
	}for(List<Integer> ri:hs)
	{
		li.add(ri);
	}
	return li; 
	}

}
