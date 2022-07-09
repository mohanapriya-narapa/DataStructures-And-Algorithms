package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] str=new String[] {"eat","tea","tan","ate","nat","bat"};
System.out.println(groupAnagrams(str));
	}

	private static HashMap<String, List<String>> groupAnagrams(String[] strs) {
		// TODO Auto-generated method stub
		HashMap<String, List<String>> hs=new HashMap<>();
		for(String str: strs)
		{
			char[] c=str.toCharArray();
			Arrays.sort(c);
		String key=String.valueOf(c);
		if(!hs.containsKey(key))
		{
			hs.put(key, new ArrayList<>());
		}
		hs.get(key).add(str);
		}
		
		return hs;
	}

}
