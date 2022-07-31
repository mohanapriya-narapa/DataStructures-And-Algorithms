package matrix;

public class MatrixDiagnalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
System.out.println( diagonalSum(nums));
	}

	private static int diagonalSum(int[][] mat) {
		// TODO Auto-generated method stub
		int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if((i==j) || (mat.length-j-1==i))
                {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
	}

}
