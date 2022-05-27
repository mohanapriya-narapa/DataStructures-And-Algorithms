package pointerMethod;

public class sortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {2,0,2,1,1,0};
sortColors(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	}

	private static int[] sortColors(int[] arr) {
		// TODO Auto-generated method stub
		int start=0;int end=arr.length-1; int cur=0;
		while(cur<=end)
		{
			if(arr[cur]==0)
			{
				swap(arr,cur,start);
				start++;
				cur++;
			}
			else if(arr[cur]==2)
			{
				swap(arr,cur, end);
				end--;
			}
			else {
				cur++;
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int cur, int start) {
		// TODO Auto-generated method stub
		int temp= arr[cur];
		arr[cur]=arr[start];
		arr[start]=temp;
	}

}
