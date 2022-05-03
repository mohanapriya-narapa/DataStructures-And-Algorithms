package Arrays;
import java.util.*;
public class SquaresArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {-4,-1,0,3,10};
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=nums[i]*nums[i];
		}
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++)
		{
		System.out.println(nums[i]);
		}
	}

}
