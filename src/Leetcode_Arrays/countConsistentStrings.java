package Leetcode_Arrays;

public class countConsistentStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] words=new String[] {"ad","bd","aaab","baa","badab"};
System.out.println(countConsistentStrings(words, "ab"));
	}

	private static int countConsistentStrings(String[] words, String allowed) {
		int count=0;
		// TODO Auto-generated method stub
for(String word: words)
{
	if(contains(allowed, word))
	{
		count++;
	}
}return count;
	}

	private static boolean contains(String allowed, String word) {
		// TODO Auto-generated method stub
for(int i=0;i< word.length();i++)
{
	if(allowed.indexOf(word.charAt(i))<0)
	{
		return false;
	}
	
}
return true;
	}

}
