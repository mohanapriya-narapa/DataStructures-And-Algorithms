package ProrityQueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class KFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,1,1,2,2,3};
		int k=2;
		System.out.println(kFrequentElements(nums, 2));

	}

	private static List<Integer> kFrequentElements(int[] nums, int k ) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int n:nums)
		{
			if(!hs.containsKey(n))
			{
				hs.put(n,0);
			}
			hs.put(n, hs.get(n)+1);
		}
		PriorityQueue<Integer> heap=new PriorityQueue<Integer> ((n1,n2)-> hs.get(n1)-hs.get(n2));
		for(int n:hs.keySet())
		{
			heap.add(n);
			if(heap.size()>k)
			{
				heap.poll();
			}
		}
		
		List<Integer> res=new LinkedList<Integer>();
		while(!heap.isEmpty())
		{
			res.add(heap.poll());
		}
		return res;
	}

}
