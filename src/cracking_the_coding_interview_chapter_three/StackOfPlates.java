package cracking_the_coding_interview_chapter_three;

import java.util.ArrayList;
import java.util.Stack;
public class StackOfPlates {
	static ArrayList<Stack<Integer>> stacks=new ArrayList<>();
	static int capacity=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
push(5);
push(7);
push(1);
push(9);
push(10);
System.out.println(pop());


	}

	private static int pop() {
		// TODO Auto-generated method stub
		Stack<Integer> lastStack=last();
	if(lastStack.isEmpty())
	{
		return -1;
	}
	else
	{
		int val=lastStack.pop();
		if(lastStack.size()==0)
		{
			stacks.remove(lastStack);
		}return val;
	}
	}

	private static void push(int i) {
		// TODO Auto-generated method stub
		Stack<Integer> lastStack=last();
		if(lastStack!=null && (lastStack.size()<capacity))
		{
			lastStack.push(i);
		}
		else
		{
			Stack<Integer> newStack=new Stack<Integer>();
			newStack.push(i);
			stacks.add(newStack);
		}
		
	}

	private static Stack<Integer> last() {
		// TODO Auto-generated method stub
		if(stacks.isEmpty())
		{
			return null;
		}
		else
		{
			return stacks.get(stacks.size()-1);
		}
	}

}
