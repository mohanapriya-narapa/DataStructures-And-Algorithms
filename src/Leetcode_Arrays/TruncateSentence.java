package Leetcode_Arrays;

public class TruncateSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(truncateSentence("Hello how are you Contestant", 4));
	}

	private static String truncateSentence(String s, int k) {
		// TODO Auto-generated method stub
	    String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++)
        {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
	}

}
