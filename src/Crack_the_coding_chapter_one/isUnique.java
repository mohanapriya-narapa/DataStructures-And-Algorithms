package Crack_the_coding_chapter_one;

public class isUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isUnique("dinesh"));

	}

	private static boolean isUnique(String str) {
		// TODO Auto-generated method stub
	boolean[] charArray= new boolean[128];
	for(int i=0;i<str.length();i++)
	{
		if(charArray[str.charAt(i)])
		{
			return false;
		}
		charArray[str.charAt(i)]=true;
	}
	return true;
	}

}
