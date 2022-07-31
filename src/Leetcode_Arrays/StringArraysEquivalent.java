package Leetcode_Arrays;

public class StringArraysEquivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] word1= {"ab", "c"};
String[] word2= {"a", "bc"};
System.out.println(ArrayStringsEqual(word1,word2));
	}

	private static boolean ArrayStringsEqual(String[] word1, String[] word2) {
		// TODO Auto-generated method stub
		 StringBuilder sb1=new StringBuilder();
	     StringBuilder sb2=new StringBuilder();
	        for(String word: word1)
	        {
	            sb1.append(word);
	        }
	          for(String word: word2)
	        {
	            sb2.append(word);
	        }
	        if(sb1.toString().equals(sb2.toString()))
	        {
	            return true;
	        }
	        return false;
	}

}
