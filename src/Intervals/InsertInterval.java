package Intervals;

import java.util.LinkedList;
import java.util.List;

public class InsertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] intervals=new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}};
int[] arr =new int[] {4,8};
int[][] merged=insertInterval(intervals,arr);
for(int i=0;i<merged.length;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.println(merged[i][j]);
	}System.out.println();
}
	}

	private static int[][] insertInterval(int[][] intervals, int[] newInterval) {
		// TODO Auto-generated method stub
		List<int[]> merged=new LinkedList<int[]>();
		for(int[] currentInterval:intervals )
		{
			if(currentInterval[1]<newInterval[0])
			{
				merged.add(currentInterval);
			}
			else if(newInterval[1]<currentInterval[0])
			{
				merged.add(newInterval);
				newInterval=currentInterval;
			}
			else
			{
				newInterval[0]=Math.min(currentInterval[0],newInterval[0]);
				newInterval[1]=Math.max(currentInterval[1],newInterval[1]);
			}
		}
		merged.add(newInterval);
		return merged.toArray(new int[merged.size()][]);

	}

}
