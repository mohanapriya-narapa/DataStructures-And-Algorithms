package Arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {4,3,2,7,8,2,3,1};
HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
for(int i=0;i<arr.length;i++)
{
	if(!hs.containsKey(arr[i]))
	{
		hs.put(arr[i],0);
	}
	hs.put(arr[i],hs.get(arr[i])+1);
}
List<Integer> li=new LinkedList<Integer>();
for(Map.Entry<Integer,Integer> mp: hs.entrySet())
{
	if(mp.getValue()>1)
	{
		li.add(mp.getKey());
	}
}System.out.println(li);
	}
}
