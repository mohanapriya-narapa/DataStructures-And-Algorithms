package Strings;

public class permutationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkPermutation("ab","eidbaooo"));
	}

	private static boolean checkPermutation(String s1, String s2) {
		// TODO Auto-generated method stub
	if(s1.length()>s2.length())
	{
		return false;
	}
	int[] s1map=new int[126];
	int[] s2map=new int[126];
	for(int i=0;i<s1.length();i++)
	{
		s1map[s1.charAt(i)]++;
		s2map[s2.charAt(i)]++;
	}
	for(int i=0;i<s2.length()-s1.length();i++)
	{
		if(matches(s1map,s2map))
		{
			return true;
		}
		s2map[s2.charAt(i+s1.length())]++;
		s2map[s2.charAt(i)]--;
	}
	return matches(s1map,s2map);
	}

	private static boolean matches(int[] s1map, int[] s2map) {
		// TODO Auto-generated method stub
	for(int i=0;i<126;i++)
	{
		if(s1map[i]!=s2map[i])
		{
			return false;
		}
	}return true;
	}

}
