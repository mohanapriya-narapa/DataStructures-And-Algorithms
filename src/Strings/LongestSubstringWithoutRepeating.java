package Strings;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(LongestSubstringWithoutRepeating("abcabcbb"));
	}

	private static int LongestSubstringWithoutRepeating(String str) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hs=new HashMap<>();
		int ans=0;
		for(int j=0,i=0;j<str.length();j++)
		{
			if(hs.containsKey(str.charAt(j)))
			{
				i=Math.max(hs.get(str.charAt(j))+1,i);
			}
			ans=Math.max(ans,j-i+1);
			hs.put(str.charAt(j),j);
		}return ans;

	}

}
