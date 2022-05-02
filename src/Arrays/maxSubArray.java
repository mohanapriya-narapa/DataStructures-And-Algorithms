package Arrays;

public class maxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int maxendhere=0;
		int maxsofar=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{maxendhere+=arr[i];
			if(maxsofar<maxendhere)
			{
				maxsofar=maxendhere;
			}
			if(maxendhere<0)
			{
				maxendhere=0;
			}
		}System.out.println(maxsofar);
		

	}

}
