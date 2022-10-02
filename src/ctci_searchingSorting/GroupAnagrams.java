package ctci_searchingSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

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
