package Leetcode;

public class MaximumNumberOfWordsFoundInSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] sentences= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
int max=0;int count=0;
for(String sentence: sentences)
{
	String[] words=sentence.split(" ");
	for(String word:words)
	{
		count++;
	}
	max=Math.max(max,count);
	count=0;
}System.out.println(max);
	}

}
