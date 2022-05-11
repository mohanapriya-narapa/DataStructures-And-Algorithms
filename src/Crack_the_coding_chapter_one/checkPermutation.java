package Crack_the_coding_chapter_one;

public class checkPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkPermutation("mona","onma"));
	}

	private static boolean checkPermutation(String str, String str2) {
		// TODO Auto-generated method stub
		int[] arr=new int[128];
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++)
		{
			arr[str2.charAt(i)]--;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				return false;
			}
		}

return true;
	}

}
