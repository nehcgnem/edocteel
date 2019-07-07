public class Solution {
    public int change(int amount, int[] coins) {
        // init
        int chart[][] = new int[coins.length + 1][amount + 1];
        chart[0][0] = 1;

        for (int i = 1; i <= coins.length; i++) {
            chart[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                chart[i][j] = chart[i - 1][j] + (j >= coins[i - 1] ? chart[i][j - coins[i - 1]] : 0);
            }
        }

        return chart[coins.length][amount];
    }
}