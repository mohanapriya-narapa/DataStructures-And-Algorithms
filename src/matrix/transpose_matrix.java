package matrix;

public class transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] mat=new int[][] {{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 0, 9}};
int[][] result=new int[mat[0].length][mat.length];
for(int i=0;i<mat.length;i++)
{
	for(int j=0;j<mat[0].length;j++)
	{
		result[j][i]=mat[i][j];
	}
}
for(int i=0;i<mat.length;i++)
{
	for(int j=0;j<mat[0].length;j++)
	{
		System.out.println(result[i][j]);
	}
}

	}

}
