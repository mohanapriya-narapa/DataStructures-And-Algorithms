package Arrays;

public class peakIndexMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int [] {0,2,1,0};
		System.out.println(peakIndex(arr));
	
			

	}

	private static int peakIndex(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length==1)
		{
			return 0;
		}
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				return i;
			}
		}
		return -1;
	}

}
