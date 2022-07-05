package leetcode.arrays;

public class BuyAndSellStock {
    static int maxProfit(int[] prices) {
//      Inline
        int min = prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int tp= prices[i]-min;
            if(tp>profit){
                profit=tp;
            }
            if(prices[i]<min){
                min=prices[i];
            }
        }
        return profit;

//        iterative method
//        int p =0;
//        for(int i =0; i<prices.length-1;i++){
//            for (int j=i+1; j<prices.length;j++){
//                int pt= prices[j]-prices[i];
//                if(pt>p){
//                    p=pt;
//                }
//            }
//
//        }
//        return p;

    }

    public static void main(String[] args) {
        int[]prices={7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println(ans);

    }
}
