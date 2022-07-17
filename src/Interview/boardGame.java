package Interview;

public class boardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= new int[][] {{ 1, 0, 1 },{ 0, 0, 0 },{ 1, 0, 1}};
boardGame(arr);
	}

	private static void boardGame(int[][] arr) {
		// TODO Auto-generated method stub
		boolean[] row=new boolean[arr.length];
		boolean[] column=new boolean[arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
		row[i]=true;
		}
		for(int i=0;i<arr[0].length;i++)
		{
		column[i]=true;
		}
	
		for(int  i=0;i<3;i++)
		{
			for(int j=0;j<3;j++ )
			{	
				if(arr[i][j]==1)
{	
	row[i]=false;
	column[j]=false;

}
	
			}
		}
		for(boolean x: row)
		{
		System.out.println(x);
		}
		for(boolean x: column)
		{
		System.out.println(x);
		}
	}

}
