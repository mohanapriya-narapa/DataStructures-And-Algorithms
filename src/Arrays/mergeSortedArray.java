package Arrays;

public class mergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1=new int[] {1,2,3,0,0,0};
		int m=3;
		int[] nums2=new int[] {2,5,6};
		int n=3;
		int i1=m-1;
		int i2=n-1;
		int i3=m+n-1;
		while(i1>=0 && i2>=0)
		{
			nums1[i3--]=nums1[i1]>nums2[i2]?nums1[i1--]:nums2[i2--];
			
		}
		while(i2>=0)
		{
			nums1[i3--]=nums2[i2--];
		}
		for(int x:nums1)
		{
			System.out.println(x);
		}

	}

}
