package Leetcode_Arrays;

public class NumberOfGoodPairs {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(arr));
	}

	private static int numIdenticalPairs(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
	}return count;
	}
	
	}

