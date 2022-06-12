package Strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] str=new String[] {"flower", "flow", "flight"};
System.out.println(longestCommonPrefix(str));
	}

	private static String longestCommonPrefix(String[] words) {
		// TODO Auto-generated method stub
		if(words.length==0)
		{
			return "";
		}
		String prefix=words[0];
		for(int i=1;i<words.length;i++)
		{
			while(words[i].indexOf(prefix)!=0)
			{
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) return "";
			}
		}
		return prefix;
		}

}
