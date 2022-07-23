package Cracking_the_coding_interview_four;

import java.util.LinkedList;
import java.util.List;

public class permutationswithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(PermutationsWithoutDuplicates("abc"));
	}

	private static List<String> PermutationsWithoutDuplicates(String str) {
		// TODO Auto-generated method stub
		List<String> res=new LinkedList<String>();
		int rem=str.length();
		if(rem==0)
			{
			res.add("");
			
		}
		for(int i=0;i<str.length();i++)
		{
			String before=str.substring(0,i);
			String after=str.substring(i+1,rem);
			List<String> partials=PermutationsWithoutDuplicates(before+after);
			for(String s:partials)
			{
			res.add(str.charAt(i)+s);	
			}
		}
		
		return res;
	}

}
