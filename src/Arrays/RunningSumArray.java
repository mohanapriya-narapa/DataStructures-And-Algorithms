package Arrays;

public class RunningSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,2,3,4};
int[] res=new int[nums.length];
res[0]=nums[0];
for(int i=1;i<nums.length;i++)
{
	res[i]=res[i-1]+nums[i];
}
for(int x:res)
{
	System.out.println(x);
}
	}

}
