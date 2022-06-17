package Strings;

public class Longestpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(longestPalindrome("babad"));
	}

	private static String longestPalindrome(String str) {
		// TODO Auto-generated method stub
		if(str.length()==0)
		{
			return "";
		}
		int n=str.length();
		boolean[][] table=new boolean[str.length()+1][str.length()+1];
		int maxlen=1;
		for(int i=0;i<n;i++)
		{
			table[i][i]=true;
			
		}
		int start=0;
		for(int i=0;i<n-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				table[i][i+1]=true;
				start=i;
				maxlen=2;		
			}
			
		}
		for(int k=3;k<=n;k++)
		{
		for(int i=0;i<n-k+1;i++)
		{
			int j=i+k-1;
			if(table[i+1][j-1] && str.charAt(i)==str.charAt(j))
			{
				table[i][j]=true;
				start=i;
				maxlen=k;
			}
		}
		}
		return str.substring(start,start+maxlen);
		
	}

}
