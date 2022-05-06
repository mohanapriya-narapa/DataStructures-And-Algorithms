package Strings;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		char ch[]=str.toCharArray();
		System.out.println(reverse(ch));

	}

	private static char[] reverse(char[] ch) {
		int i=0;int j=ch.length-1;
		while(i<=j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
			
		}
		return ch;
	}

}
