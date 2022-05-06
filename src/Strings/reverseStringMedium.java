package Strings;

public class reverseStringMedium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Let's take LeetCode contes";
		String[] words=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for(String s:words)
		{
			sb.append(new StringBuilder(new StringBuilder(s)).reverse().toString()+" ");
		}
		System.out.println(sb.toString());

	}

}
