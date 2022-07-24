package Cracking_the_coding_interview_five;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3));

	}

	private static HashSet<String> generateParenthesis(int n) {
		HashSet<String> set=new LinkedHashSet<String>();
		// TODO Auto-generated method stub
		if(n==0)
		{
			set.add("");
		}
		else
		{
			HashSet<String> parts=generateParenthesis(n-1);
			for(String str: parts)
			{
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)=='(')
					{
						String s=insertParanthesis(str, i);
						set.add(s);
					}
				}set.add("()"+str);
				
			}
		}
		return set;
	}

	private static String insertParanthesis(String str, int i) {
		// TODO Auto-generated method stub
		String prefix=str.substring(0, i+1);
	String end=str.substring(i+1);
	return prefix+"()"+end;
	}

}
