package Intervals;

import java.util.Arrays;

public class canAttendMeetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals=new int[][] {{0,30},{5,10},{15,20}};
		System.out.println(canAttendMeeting(intervals));
	}

	private static boolean canAttendMeeting(int[][] intervals) {
		// TODO Auto-generated method stub
		Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
	for(int i=1;i<intervals.length;i++)
	{
		if(intervals[i-1][1]>intervals[i][0])
		{
			return false;
		}
	}return true;
	
	}

}
