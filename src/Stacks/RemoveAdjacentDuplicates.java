package Stacks;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(removeDuplicates("abbaca"));
	}

	private static String removeDuplicates(String s) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.isEmpty())
            {
                if(st.peek()==s.charAt(i))
                {
                    st.pop();
                }
                else
                {
                    st.push(s.charAt(i));
                }
            }
            else
            {
 st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.peek());
            st.pop();
        }return sb.reverse().toString();
	}

}
