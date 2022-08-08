package Leetcode_Arrays;

public class GreatestElementRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {17,18,5,4,6,1};
int[] result=replaceElements(arr);
for(int x:result)
{
	System.out.println(x);
}
	}

	private static int[] replaceElements(int[] arr) {
		// TODO Auto-generated method stub
		int maxSoFar=-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			int temp=arr[i];
			arr[i]=maxSoFar;
			maxSoFar=Math.max(temp,arr[i]);
		}
		return arr;
	}

}
