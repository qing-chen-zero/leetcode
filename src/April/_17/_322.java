package April._17;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/4/17 13:36
 * @description：零钱兑换
 * @modified By：
 * @version: $
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
 * 你可以认为每种硬币的数量是无限的。
 * 输入：coins = [1, 2, 5], amount = 11
 * 输出：3
 * 解释：11 = 5 + 5 + 1
 */
public class _322 {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int curr = 1; curr <= amount; curr ++) {
            for (int coin : coins) {
                int left = curr - coin;
                if (left < 0 || dp[left] == Integer.MAX_VALUE) continue;
                dp[curr] = Math.min(dp[left] + 1, dp[curr]);
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5};
        System.out.println(coinChange(coins,11));
    }
}
