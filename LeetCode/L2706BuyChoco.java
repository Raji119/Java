package LeetCode;

public class L2706BuyChoco {
    public int buyChoco(int[] prices, int money) {

        int minIndex = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[minIndex] > prices[i]) {
                minIndex = i;
            }
        }

        if ((money - prices[minIndex]) < 0) {
            return money;
        }

        int res = -1;

        for (int i = 0; i < prices.length; i++) {
            int minRes = money - prices[minIndex] - prices[i];
            if (i != minIndex && res < minRes && minRes >= 0) {
                res = minRes;
            }
        }

        System.out.println(res);

        return (res >= 0) ? res : money;

    }
}
