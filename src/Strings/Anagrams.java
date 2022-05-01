package Strings;

import java.util.*;

public class Anagrams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[] {"eat","tea","tan","ate","nat","bat"};
		HashMap<String,List> hs=new HashMap<>();
	
		for(String s: str)
		{
			char[] c=s.toCharArray();
			Arrays.sort(c);
			String key=new String(c);
			if(!hs.keySet().contains(key))
			{
				hs.put(key, new ArrayList<>());
			}
			hs.get(key).add(s);
		}
	
		System.out.println(hs.values());
		//print
		

	}

}
