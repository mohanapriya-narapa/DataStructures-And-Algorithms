package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class nextGreatestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums1=new int[] {4,1,2};
int[] nums2=new int[] {1,3,4,2};
int[] result=greatestElement(nums1,nums2);
for(int x:result)
{
	System.out.println(x);
}
	}

	private static int[] greatestElement(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
	HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	for(int i=0;i<nums2.length;i++)
	{
		hs.put(nums2[i],i);
	}
	   int[] result=new int[nums1.length];
       Arrays.fill(result,-1);
       for(int i=0;i<nums1.length;i++)
       {
    	   for(int j=hs.get(nums1[i]);j<nums2.length;j++)
    	   {
    		   if(nums2[j]>nums1[i])
    		   {
    			   result[i]=nums2[j];
    			   break;
    		   }
    	   }
       }return result;
	}

}
