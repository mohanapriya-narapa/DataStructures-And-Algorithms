package Leetcode_Arrays;

public class FinalPricesSpecialDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] prices=new int[] {8,4,6,2,3};
int[] res=finalPrices(prices);
for(int x:res)
{
	System.out.println(x);
}
	}

	private static int[] finalPrices(int[] prices) {
		// TODO Auto-generated method stub
        int[] res=new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
            res[i]=prices[i];
        }
        
        for(int i=0;i<prices.length;i++)
        {
for(int j=i+1;j<prices.length;j++)
{
    if(prices[i]>=prices[j])
    {
        res[i]=prices[i]-prices[j];
        break;
    }
}
        }return res;
	}

}
