package Intervals;

import java.util.Arrays;
import java.util.PriorityQueue;

public class meetingRoomsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals=new int[][] {{0,30},{5,10},{15,20}};
		System.out.println(numberOfRoomsRequired(intervals));
	}

	private static int numberOfRoomsRequired(int[][] intervals) {
		int rooms=0;
		// TODO Auto-generated method stub
		Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int[] interval:intervals)
		{
			pq.add(interval[1]);
		}
		
		for(int[] interval: intervals)
		{
			if(!pq.isEmpty() && pq.peek()<interval[0])
			{
				pq.poll();
			}
			else
			{
				rooms++;
			}
		}
		return rooms;
	}

}
