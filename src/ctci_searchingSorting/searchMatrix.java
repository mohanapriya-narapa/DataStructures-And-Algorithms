package ctci_searchingSorting;

public class searchMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] matrix =new int[][]  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
int m=matrix.length;
int n=matrix[0].length;
int i=0;int j=n-1;
int target=20;
boolean result=false;
while(i<m && j>=0)
{
	if(matrix[i][j]==target)
	{
result=true;
		break;
	}
	if(matrix[i][j]<target)
	{
		i++;
	}
	else
	{
		j--;
	}
}
System.out.println(result);
	}

}
