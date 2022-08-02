package Leetcode_Arrays;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,3,2,1,3,2,2};
int[] res=numberOfPairs(nums);
for(int x:res)
{
	System.out.println(x);
}
	}

	private static int[] numberOfPairs(int[] nums) {
		// TODO Auto-generated method stub
        int count=0;int left=0;
        int[] res=new int[2];
        HashMap<Integer, Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!(hs.containsKey(nums[i])))
            {
                hs.put(nums[i],0);
            }
            hs.put(nums[i],hs.get(nums[i])+1);
        }
        for (Map.Entry<Integer, Integer> set : hs.entrySet()) {
if((set.getValue() % 2)!=0)
{
    left++;

}
    
                count=count+(set.getValue() / 2);
            
        }res[0]=count;
        res[1]=left;
        return res;
	}

}
