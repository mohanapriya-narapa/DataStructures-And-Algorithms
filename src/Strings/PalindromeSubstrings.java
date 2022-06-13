package Strings;

public class PalindromeSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(palindromeSubstrings("abc"));
	}

	private static int palindromeSubstrings(String str) {
		// TODO Auto-generated method stub
int count=0;
boolean[][] table=new boolean[str.length()][str.length()];
if(str.length()==0)
{
	return 0;
}
int n=str.length();

int maxlen=1;
for(int i=0;i<str.length();i++)
{
	table[i][i]=true;count++;
}
for(int i=0;i<str.length()-1;i++)
{
	if(str.charAt(i)==str.charAt(i+1))
	{
		table[i][i+1]=true;
		count++;
	}
}
for(int k=3;k<str.length();k++)
{
	for(int i=0;i<str.length()-k+1;i++)
	{
	int j=i+k-1;
	if(table[i+1][j-1] && (str.charAt(i)==str.charAt(j)))
	{
		count++;table[i][j]=true;
	}
	}
}return count;
	}

}
