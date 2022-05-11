package Strings;

public class smallestLettersGreaterTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch=new char[] {'c','f','j'};
		char target='a';
		for(char c:ch)
		{
			if(c>target)
			{
				System.out.println(c);
				break;
			}
		}
		

	}

}
