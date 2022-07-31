package Leetcode_Arrays;

import java.util.Arrays;

public class MinimumNumberMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] seats=new int[] {3,1,5};
int[] students=new int[] {2,7,4};
System.out.println(minMovesToSeat(seats, students));

	}

	private static int minMovesToSeat(int[] seats, int[] students) {
		// TODO Auto-generated method stub
		Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;
        for(int i=0;i<seats.length;i++)
        {
            ans+=Math.abs(seats[i]-students[i]);
        }
        return ans;
	}

}
