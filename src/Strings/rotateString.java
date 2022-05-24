package Strings;

public class rotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(rotateString("abcde","cdeab"));
	}

	private static boolean rotateString(String string, String string2) {
		// TODO Auto-generated method stub
String s1=string.concat(string2);
return ((string.length()==string2.length()) && (s1.indexOf(string)!=-1?true:false));
	}

}
