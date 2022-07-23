package Cracking_the_coding_interview_four;

public class coinsChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1, 2, 5};
System.out.println(makeChange(arr, 11, 0));
	}

	private static int makeChange(int[] arr,int n,  int index) {
		// TODO Auto-generated method stub
		if(index>=arr.length-1)
		{
			return 1;
		}
		int ways=0;
		int denomAmount=arr[index];
		for(int i=0;i*denomAmount<=n;i++)
		{
			int amountRem=n-(i*denomAmount);
			ways+=makeChange(arr,amountRem, index+1);
		}
		return ways;
	}

	
}
