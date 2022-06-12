package Strings;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(longestCommonSubstring("abcdef", "zcdemf"));
	}

	private static int longestCommonSubstring(String str1, String str2) {
		// TODO Auto-generated method stub
		int[][] res=new int[str1.length()+1][str2.length()+1];
		int max=0;
		for(int i=1;i<=str1.length();i++)
		{
			for(int j=1;j<=str2.length();j++)
			{
				if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					res[i][j]=res[i-1][j-1]+1;
					max=Math.max(max,res[i][j]);
				}
			}
		}
		return max;
		
	}

}
