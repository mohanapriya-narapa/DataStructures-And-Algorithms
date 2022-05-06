package Arrays;

public class concatinationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,3,2,1};
int [] arr=new int[nums.length*2];
for(int i=0;i<nums.length;i++)
{
	arr[i]=nums[i];
	arr[i+nums.length]=nums[i];
}
for(int x:arr)
{
	System.out.println(x);
}
	}

}
