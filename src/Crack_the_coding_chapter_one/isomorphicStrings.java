package Crack_the_coding_chapter_one;

import java.util.HashMap;

public class isomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isomorphicStrings("egg","add"));
	}

	private static boolean isomorphicStrings(String string, String string2) {
	HashMap<Character,Character> hs=new HashMap<Character,Character>();
	for(int i=0;i<string.length();i++)
{
	char c1=string.charAt(i);
	char c2=string2.charAt(i);
	if(hs.containsKey(c1))
	{
		if(hs.get(c1)!=c2)
		{
			return false;
		}
	}
	else
	{
		if(hs.containsValue(c2))
		{
			return false;
		}
		hs.put(c1,c2);
	}
}return true;
	}

}
