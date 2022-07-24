package Cracking_the_coding_interview_five;

public class magicIndexWithDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= new int[] {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
System.out.println(magicIndexWithDuplicates(arr, 0, 11));
	}

	private static int magicIndexWithDuplicates(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start>end)
		{
			return -1;
		}
		int mid=(start+end)/2;
		if(arr[mid]==mid)
			return mid;
		int right= magicIndexWithDuplicates(arr, start, Math.min(arr[mid], mid-1));
		if(right>=0)
			return right;
		return magicIndexWithDuplicates(arr, Math.max(arr[mid], mid+1), end) ;
	}

}
