
public class Lab8 {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for(int i = 1; i < amount+1; i++) {
        	dp[i] = amount+1;
        }
        dp[0] = 0;
        
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];
    }
    
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount)); // Output: 3
        System.out.println(coinChange(coins, 6)); // Output: 2
        System.out.println(coinChange(coins, 3)); // Output: 2
        System.out.println(coinChange(coins, 16)); // Output: 4
    }
}
