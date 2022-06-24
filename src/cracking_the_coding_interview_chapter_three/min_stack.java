package cracking_the_coding_interview_chapter_three;

import java.util.Stack;

public class min_stack {
static Stack<Integer> st1=new Stack<Integer>();
static Stack<Integer> st2=new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
push(1);push(5);push(7);push(8);System.out.println(getMin());pop();
	}
	private static void pop() {
		// TODO Auto-generated method stub
		if(st1.peek()==getMin())
		{
			st2.pop();
		}
		st1.pop();
	}
	private static int getMin() {
		// TODO Auto-generated method stub
		if(st2.isEmpty())
		{
			  return Integer.MAX_VALUE;
		}
		else
		{
			return st2.peek();
		}
	}
//	private static void min_stack() {
//		// TODO Auto-generated method stub
//		
//	}
	private static void push(int i) {
		// TODO Auto-generated method stub
		st1.push(i);
		if(st2.isEmpty() ||( i<getMin()))
		{
			st2.push(i);
		}
		
	}

}
