package Strings;

import java.util.Stack;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPalindrom("a man, a plan, a canal: panama"));
	}

	private static boolean isPalindrom(String str) {
		// TODO Auto-generated method stub
		int count=0;
		char[] charset=str.toLowerCase().toCharArray();
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(isChar(str.charAt(i)))
			{
				st.push(str.charAt(i));
			}
		}
		for(int i=0;i<str.length();i++)
		{
			if(isChar(str.charAt(i)) && st.pop()!=str.charAt(i))
			{
				return false;
			}
		}
		return true;
	
	}

	private static boolean isChar(char c) {
		// TODO Auto-generated method stub
		if((c>='0' && c<='9' ) || (c>='a' && c<='z'))
		{
			return true;
		}
		return false;
	}

}
