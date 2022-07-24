package Cracking_the_coding_interview_five;

import java.util.ArrayList;

public class eightQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer[]> res=new ArrayList<Integer[]>();
		Integer[] board=new Integer[8];
		placeQueens(board,0, res);
		for(Integer[] list:res)
		{
			for(int x:list)
			{
				System.out.print(x);
			}
			System.out.println(" ");
		}

	}

	private static void placeQueens(Integer[] board, int row, ArrayList<Integer[]> res) {
		// TODO Auto-generated method stub
		if(row==board.length)
		{
			res.add((Integer [])board.clone());
		}
		else
		{
			for(int col=0;col<board.length;col++)
			{
				if(isValid(row, col, board))
				{
					board[row]=col;
					placeQueens(board, row+1, res);
				}
			}
				
		}
		
	}

	private static boolean isValid(int row, int col, Integer[] board) {
		// TODO Auto-generated method stub
		for(int rowOld=0;rowOld<row;rowOld++)
		{
			Integer colOld=board[rowOld];
			if(colOld==col)
			{
				return false;
			}
			int colDis=Math.abs(colOld-col);
			int rowDis=row-rowOld;
			if(rowDis==colDis)
			{
				return false;
			}
			
		}
		return true;
	}

}
