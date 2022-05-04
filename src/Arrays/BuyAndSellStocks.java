package Arrays;

public class BuyAndSellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices=new int[] {7,1,5,3,6,4};
		int min=prices[0];
		int profit=0;
		for(int p:prices)
		{
			min=Math.min(min,p);
			profit=Math.max(profit,p-min);
		}System.out.println(profit);

	}

}
