package Arrays;

public class buildArrayPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {0,2,1,5,3,4};
int[] res=new int[arr.length];
for(int i=0;i<arr.length;i++)
{
	res[i]=arr[arr[i]];
}
for(int x:res)
{
	System.out.println(x);
	System.out.println(x+1);
}

	}

}
