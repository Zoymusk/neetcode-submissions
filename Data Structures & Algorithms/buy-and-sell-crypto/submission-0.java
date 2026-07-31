class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprice = 0;

        for(int price : prices){
            minprice = Math.min(minprice, price);
            maxprice = Math.max(maxprice, price-minprice);
        }
        return maxprice;
    }
}
