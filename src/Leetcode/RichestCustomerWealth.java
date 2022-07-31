package Leetcode;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat=new int[][] {{1,2,3},{3,2,1}};
		System.out.println(maximumWealth(mat));

	}

	private static int maximumWealth(int[][] mat) {
		// TODO Auto-generated method stub
		int sum=0;
		int max=0;
		for(int[] member:mat)
		{
			for(int x:member)
			{
				sum+=x;
			}
			max=Math.max(sum,max);
			sum=0;
		}
		return max;
	}

}
