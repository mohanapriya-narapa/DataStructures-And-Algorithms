package Leetcode_Arrays;

public class FinalValueOfVariableAfterPerformingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] operations= {"--X","X++","X++"};
System.out.println(PerformingOperations(operations));
	}

	private static int PerformingOperations(String[] operations) {
		// TODO Auto-generated method stub
	int count=0;
	for(String str : operations)
	{
	if(str.contains("-"))
	{
		count--;
	}
	else
	{
		count++;
	}
		
	}
	return count;
	}

}
