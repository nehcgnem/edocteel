public class Solution1DArray {

    public int change(int amount, int[] coins) {
        int value[] = new int[amount + 1];
        value[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                value[i] += value[i - coin];
            }
        }

        return value[amount];
    }
}
