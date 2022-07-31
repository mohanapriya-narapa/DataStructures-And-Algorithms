package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] indices=new int[] {4,5,6,7,0,2,1,3};
System.out.println(restoreString("codeleet", indices));
	}

	private static String restoreString(String s, int[] indices) {
		// TODO Auto-generated method stub
        HashMap<Integer,Character> hs=new HashMap<Integer, Character>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            hs.put(indices[i],s.charAt(i));
        }
        for (Map.Entry<Integer, Character> entry : hs.entrySet()) {
    Integer key = entry.getKey();
    Object value = entry.getValue();
            sb.append(value);
}return sb.toString();
	}

}
