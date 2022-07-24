package Cracking_the_coding_interview_five;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class PermutationsWithDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(printParams("aabbc"));
	}

	private static List<String> printParams(String string) {
		// TODO Auto-generated method stub
		List<String> res=new LinkedList<String>();
	HashMap<Character, Integer> hs=buildHashMap(string);
	printParams(hs, "",res,string.length() );
	return res;
	}

	private static void printParams(HashMap<Character, Integer> hs, String prefix, List<String> res, int length) {
		// TODO Auto-generated method stub
		if(length==0)
		{
			res.add(prefix);
			return;
		}
		for(char c: hs.keySet())
		{
			int count=hs.get(c);
			if(count>0)
			{hs.put(c, count-1);
			printParams(hs, prefix+c,res, length-1);
			hs.put(c, count);
			}
		}
		
	}

	private static HashMap<Character, Integer> buildHashMap(String string) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hs=new HashMap<Character,Integer>();
		for(int i=0;i<string.length();i++)
	{if(!hs.containsKey(string.charAt(i)))
	{
		hs.put(string.charAt(i), 0);
	}hs.put(string.charAt(i), hs.get(string.charAt(i)) +1);
			
		}
		return hs;
	}

}
