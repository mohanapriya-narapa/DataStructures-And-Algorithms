package Leetcode_Arrays;

import java.util.HashMap;
import java.util.Map;

public class DivideArrayEqualPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {3,2,3,2,2,2};
	System.out.println(divideArray(nums));
	}

	private static boolean divideArray(int[] nums) {
		// TODO Auto-generated method stub
	     HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	            if(!hs.containsKey(nums[i]))
	            {
	                hs.put(nums[i], 1);
	            }
	            else 
	            {
	hs.put(nums[i], hs.get(nums[i])+1);
	            }
	}
	     for (Map.Entry<Integer, Integer> set :hs.entrySet()) {
	 if(set.getValue()%2 !=0)
	 {
	     return false;
	 }
	        }  
	        return true;
	        
	}

}
