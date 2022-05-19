package Intervals;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals=new int[][] { {1,3}, {2,6},{8,10},{15,18}};
int[][] merged =mergeIntervals(intervals);
for(int i=0;i<merged.length;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.println(merged[i][j]);
	}System.out.println();
}
	}

	private static int[][] mergeIntervals(int[][] intervals) {
		// TODO Auto-generated method stub
Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
LinkedList<int[]> merged=new LinkedList<int[]>();
for(int[] interval:intervals)
{
	if(merged.isEmpty() || merged.getLast()[1]< interval[0])
	{
		merged.add(interval);
	}
	else
	{
		merged.getLast()[1]=Math.max(merged.getLast()[1], interval[1]);
	}
}
return merged.toArray(new int[merged.size()][]);
	}

}
