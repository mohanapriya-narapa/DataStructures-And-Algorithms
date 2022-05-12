package Crack_the_coding_chapter_one;

public class oneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(oneAway("plee","pale"));

	}

	private static boolean oneAway(String str, String str2) {
		// TODO Auto-generated method stub
		if(str.length()==str2.length())
		{
			return replace(str,str2);
		}
		else if(str.length()<str2.length())
		{
			return insert(str,str2);
		}
		else
		{
			return insert(str2,str);
		}
	}

	private static boolean insert(String str, String str2) {
		
		// TODO Auto-generated method stub
	int index1=0;int index2=0;
	while(index1<str.length() && index2<str2.length() )
	{
		if(str.charAt(index1)!=str2.charAt(index2))
		{
			if(index1!=index2)
			{
				return false;
			}
			index2++;
		}
		else {
			index1++;
			index2++;
		}
		
	}
			
	return true;
	}

	private static boolean replace(String str, String str2) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str2.charAt(i))
			{
				if(flag)
				{
					return false;
				}
				flag=true;
			}
		}
		return flag;
		
	}

}
