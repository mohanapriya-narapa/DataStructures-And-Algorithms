package Leetcode_Arrays;

public class QueryTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] start=new int[] {1,2,3};
int[] end=new int[] {3,2,7};
System.out.println(busyTime(start,end,4));
	}

	private static int busyTime(int[] startTime, int[] endTime, int queryTime) {
		// TODO Auto-generated method stub
		  int count=0;
		     for(int i=0;i<startTime.length;i++)
		     {
		         if(startTime[i]<=queryTime && endTime[i]>=queryTime)
		         {
		             count++;
		         }
		     }
		        return count;
	}

}
