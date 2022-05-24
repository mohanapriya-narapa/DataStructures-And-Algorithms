package slidingWindow;

import java.util.HashSet;

public class subStringSize3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sizeSubstring("xyzzaz"));
	}

	private static int sizeSubstring(String str) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<=str.length()-3;i++)
		{
			HashSet<Character> hs=new HashSet<Character>();
			for(int j=i;j<i+3;j++)
			{
				hs.add(str.charAt(j));
				
			}
			if(hs.size()==3)
			{
				count++;
			}
		}return count;
	}

}
