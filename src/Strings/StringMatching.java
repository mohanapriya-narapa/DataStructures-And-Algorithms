package Strings;

import java.util.LinkedList;
import java.util.List;

public class StringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] words=new String[] {"mass","as","hero","superhero"};
System.out.println(matchingString(words));
	}

	private static List<String> matchingString(String[] words) {
		
		// TODO Auto-generated method stub
		List<String> li=new LinkedList<String>();
for(String s:words)
{
	for(String ss:words)
	{
		if(ss.contains(s) && !ss.equals(s))
		{
			li.add(s);
			break;
		}
	}
}return li;
	}

}
