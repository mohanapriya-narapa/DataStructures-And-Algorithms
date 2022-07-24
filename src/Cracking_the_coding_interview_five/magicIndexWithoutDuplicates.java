package Cracking_the_coding_interview_five;

public class magicIndexWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= new int[] {-40,-20,-1,1,2,3,5,7,9,12,13};
System.out.println(magicIndex(arr, 0, 11));
	}

	private static int magicIndex(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(j<i)return -1;
		int mid=(i+j)/2;
		if(arr[mid]==mid) return mid;
		if(arr[mid]>mid) return magicIndex(arr, i, mid-1);
		else
		{
			 return magicIndex(arr, mid+1, j);
		}
	}

}
