package Leetcode_Arrays;

public class FirstPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] words=new String[] {"abc","car","ada","racecar","cool"};
System.out.println(firstPalindrome(words));
	}

	private static String firstPalindrome(String[] words) {
		// TODO Auto-generated method stub
		   for(String word:words)
	        {
	            if(isPaindrome(word))
	            {
	                return word;
	            }
	        }return "";
	}
	public static boolean isPaindrome(String word)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=word.length()-1;i>=0;i--)
        {
            sb.append(word.charAt(i));
        }
        return word.equals(sb.toString());
    }

}
