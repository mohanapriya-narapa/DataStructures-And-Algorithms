package slidingWindow;

public class min_size_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {2,3,1,2,4,3};
		System.out.println(minSizeSubarraySum(arr,7));

	}

	private static int minSizeSubarraySum(int[] arr, int target) {
		// TODO Auto-generated method stub
		int end=0,start=0;
		int minlen=Integer.MAX_VALUE;
		int sum=0;
		while(end<arr.length)
		{
			sum+=arr[end];
			while(sum>=target)
			{
				int len=end-start+1;
				minlen=Math.min(minlen,len);
				sum-=arr[start++];
			}
			end++;
		}
		
		return minlen;
	}

}
