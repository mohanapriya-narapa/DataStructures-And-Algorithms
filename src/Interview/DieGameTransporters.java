package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class DieGameTransporters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] teleporters=new String[] {"3,1", "4,2", "5,10"};
		System.out.println(destinations(teleporters, 6, 0, 20));

	}

	private static HashSet<Integer> destinations(String[] teleporters, int dice, int start, int end) {
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		String[] strs = null;
		HashSet<Integer> result=new HashSet<Integer>();
		// TODO Auto-generated method stub
for(int i=0;i<teleporters.length;i++)
{
	strs=teleporters[i].split(",");
	hs.put(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]));
	System.out.println(hs);
}
for(int i=1;i<=dice;i++)
{
	if(hs.containsKey(i))
	{
		result.add(hs.get(i));
	}
	else
	{
		result.add(start+i);
	}
}
return result;
	}

}
