package Strings;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="aa";
String str2="aab";
int[] arr=new int[126];
for(int i=0;i<str.length();i++)
{
	arr[str2.charAt(i)]++;
}
for(int i=0;i<str.length();i++)
{
	arr[str.charAt(i)]--;
}
for(int i=0;i<arr.length;i++)
{
	if(arr[i]<0)
	{
		System.out.println(false);
	}break;
}System.out.println(true);
	}

}
