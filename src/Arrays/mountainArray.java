package Arrays;

public class mountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {0,3,2,1};
System.out.println(mountainArray(arr));
	}

	private static boolean mountainArray(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;int n=arr.length;
		while(i+1<n && arr[i]<arr[i+1])
		{
			i++;
		}
		if(i==0 || i==n-1)
		{
			return false;
		}
		while(i+1<n && arr[i]>arr[i+1])
		{
			i++;
		}
		return i==n-1;
	}

}
