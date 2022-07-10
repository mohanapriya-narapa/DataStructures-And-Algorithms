package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MostCommonWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String[] banned=new String[] {"hit"};
	System.out.println(MostCommonWords(banned, "Bob hit a ball the hit ball flew far after it was hit"));
	

	}

	private static String MostCommonWords(String[] banned, String str) {
	     Set<String> ban=new HashSet<String>();
	        for(String st:banned)
	        {
	            ban.add(st.toLowerCase());
	        }
		// TODO Auto-generated method stub
	String[] words=str.split(" ");
	HashMap<String, Integer> hsmap=new HashMap<>();
	
	for(String word: words)
	{
		if(!hsmap.containsKey(word))
		{
			hsmap.put(word,0);
		}
		hsmap.put(word, hsmap.get(word)+1);
	}
System.out.println(hsmap);
System.out.println(ban);
	int max=-1;String res="";
	for(String str1: hsmap.keySet())
	{
		if((!(ban.contains(str1))) && (hsmap.get(str1)>max))
		{
			max=hsmap.get(str1);
			res=str1;
		}
				
	}return res;
	}

}
