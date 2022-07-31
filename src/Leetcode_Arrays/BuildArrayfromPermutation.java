package Leetcode_Arrays;

public class BuildArrayfromPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {0,2,1,5,3,4};
int[] res=buildArray(arr);
for(int x:res)
{
	System.out.println(x);
}
	}

	private static int[] buildArray(int[] arr) {
		// TODO Auto-generated method stub
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			res[i]=arr[arr[i]];
		}return res;
	}

}
