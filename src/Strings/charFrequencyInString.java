package Strings;

import java.util.HashMap;

public class charFrequencyInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="frequency";
HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
for(int i=0;i<str.length();i++)
{char c=str.charAt(i);
	hs.put(c, hs.getOrDefault(c,0)+1);
}
System.out.println(hs);
	}

}
