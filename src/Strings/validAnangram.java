package Strings;

public class validAnangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="anagram";
String str2="nagaram";
int[] arr=new int[126];
for(int i=0;i<str1.length();i++)
{
	arr[str1.charAt(i)]++;
	
}
for(int i=0;i<str2.length();i++)
{
	arr[str2.charAt(i)]--;
	
}
for(int i=0;i<arr.length;i++)
{
	if(arr[i]!=0)
	{
		System.out.println(false);
	}
}System.out.println(true);
	}

}
