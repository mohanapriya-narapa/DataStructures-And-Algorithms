package Strings;
import java.util.HashMap;

public class FirstUniqueCharcater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="leetcode";
HashMap<Character, Integer> hs=new HashMap<Character,Integer>();
for(int i=0;i<str.length();i++)
{
	char c=str.charAt(i);
	hs.put(c,hs.getOrDefault(c,0)+1);
}
for(int i=0;i<str.length();i++)
{
	if(hs.get(str.charAt(i))==1)
	{
		System.out.println(i);
		break;
	}
}
	}

}
