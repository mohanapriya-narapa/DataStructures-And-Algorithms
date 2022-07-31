package Leetcode_Arrays;

public class FlippingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] nums=new int[][] {{1,1,0},{1,0,1},{0,0,0}};
int[][] res= flipAndInvertImage(nums);
for(int i=0;i<res.length;i++)
{
    for(int j=0;j<res[0].length;j++)
    {
        System.out.println(res[i][j]);
    }
}
	}

	private static int[][] flipAndInvertImage(int[][] image) {
		// TODO Auto-generated method stub
		 int[][] res=new int[image.length][image[0].length];
	        for(int i=0;i<image.length;i++)
	        {
	            for(int j=0;j<image[0].length;j++)
	            {
	                res[i][j]=image[i][image.length-1-j];
	            }
	        }
	for(int i=0;i<image.length;i++)
	        {
	            for(int j=0;j<image[0].length;j++)
	            {
	              if(res[i][j]==1)
	              {
	                  res[i][j]=0;
	              }
	                 else
	                 {
	                     res[i][j]=1;
	                 }
	            }
	        }
	        return res;		
	}

}
