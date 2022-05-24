package Intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals=new int[][] {{1,2},{2,3},{3,4},{1,3}};
		System.out.println(eraseIntervals(intervals));
	}

	private static int eraseIntervals(int[][] intervals) {
		// TODO Auto-generated method stub
	int overlappingCount=0;
	Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
	int start=0;int end=1;
	while(end<intervals.length)
	{
		if(intervals[start][1]>intervals[end][0])
		{
			overlappingCount=1;
		}
		else
		{
			start=end;
		}
		end++;
	}
	return overlappingCount;
	}

}
