package matrix;

import java.util.HashSet;

public class zeroMatrix {
	public static void main(String[] args) {
	 int[][] image= {{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 0, 9}};
	 HashSet<Integer> row=new HashSet<Integer>();
	 
	 HashSet<Integer> column=new HashSet<Integer>();
	 for(int i=0;i<image.length;i++)
	 {
		 for(int j=0;j<image[0].length;j++)
		 {
			 if(image[i][j]==0)
			 {
				 row.add(i);
				 column.add(j);
			 }
		 }
	 }
	 for(int i=0;i<image.length;i++)
	 {
		 for(int j=0;j<image[0].length;j++)
		 {
		if(row.contains(i) || column.contains(j))
		{
			image[i][j]=0;
		}
		 }
	 }

	 for(int i=0;i<image.length;i++)
	 {
		 for(int j=0;j<image[0].length;j++)
		 {
	
			System.out.println(image[i][j]);
		
		 }
		 System.out.println("");
	 }
	}
}
