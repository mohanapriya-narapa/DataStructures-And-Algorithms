package Arrays;

public class IslandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] grid=new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

int rows=grid.length;int cols=grid[0].length;int perimeter=0;
for(int i=0;i<rows;i++)
{
	for(int j=0;j<cols;j++)
	{int sum=4;
		if(grid[i][j]==0)
		{
			continue;
		}
		if(i-1>=0)
			sum-=grid[i-1][j];
		if(i+1<rows)
			sum-=grid[i+1][j];
		if(j-1>=0)
			sum-=grid[i][j-1];
		if(j+1<cols)
			sum-=grid[i][j+1];
		perimeter+=sum;
			
	}
}System.out.println(perimeter);
	}

}
