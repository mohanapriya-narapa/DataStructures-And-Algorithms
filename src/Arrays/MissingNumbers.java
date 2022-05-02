package Arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {9,6,4,2,3,5,7,0,1};
int n=arr.length;int sum=0;
for(int i=0;i<arr.length;i++)
{
	sum+=arr[i];
}int result=(n*(n+1))/2;
System.out.println(result-sum);
	}

}
