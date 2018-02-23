package Medium;

public class BuySellStockCoolDown {
    public static void main(String[] args){
        int[] stockProces = {1,2,3,0,2};
        int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
        for (int price : stockProces) {
            prev_buy = buy;
            buy = Math.max(prev_sell - price, prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price, prev_sell);
        }
        System.out.print(sell);
    }
}
