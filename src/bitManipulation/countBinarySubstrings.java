package bitManipulation;

public class countBinarySubstrings {
	public static void main(String[] args) {
String str="00110011";
int ans=0,cur=1,prev=0;
for(int i=1;i<str.length();i++)
{
	if(str.charAt(i)!=str.charAt(i-1))
	{
		ans+=Math.min(prev,cur);
		prev=cur;
		cur=1;
	}
	else {
		cur++;
	}
}
System.out.println(ans+Math.min(prev,cur));
}
}