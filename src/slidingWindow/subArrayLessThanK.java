package slidingWindow;

public class subArrayLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {10,5,2,6};
		int k=100;
		System.out.println(subArrays(arr,k));

	}

	private static int subArrays(int[] arr, int k) {
		// TODO Auto-generated method stub
	if(k<=1)
	{
		return 0;
	}
	int start=0;int end=0;int subArrays=0;int temp=1;
	while(end<arr.length)
	{
		temp=temp*arr[end];
		while(temp>=k)
		{
			temp/=arr[start++];
		}
		subArrays+=end-start+1;
		end++;
	}
	return subArrays;

	}

}
