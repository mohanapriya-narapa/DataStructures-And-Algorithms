package Strings;

import java.util.LinkedList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] words=new String[] {"leet","code"};
List<String> li=new LinkedList<>();
for(String str:words)
{
	li.add(str);
}
System.out.println(wordBreak("leetcode", li));

}

	private static boolean wordBreak(String str, List<String> li) {
		// TODO Auto-generated method stub
		boolean[] dp=new boolean[str.length()+1];
		dp[0]=true;
for(int i=0;i<=str.length();i++)
{
	for(int j=0;j<i;j++)
	{
		if(dp[j] && li.contains(str.substring(j,i)))
		{
			dp[i]=true;
			break;
		}
	}
}
return dp[str.length()];
	}
}