package Leetcode_Arrays;

import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumberCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] candies=new int[] {2,3,5,1,3};
System.out.println(kidsWithCandies(candies, 3));
	}

	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		// TODO Auto-generated method stub
	    Boolean[] result=new Boolean[candies.length];
	    Arrays.fill(result, Boolean.FALSE);
	      int max=0;
	           for(int x: candies)
	           {
	               max=Math.max(max,x);
	           }
	           for(int i=0;i<candies.length;i++)
	           {
	               if((candies[i]+extraCandies)>=max)
	               {
	                   result[i]=true;
	               }
	           }
	           return  Arrays.asList(result);
	}

}
 