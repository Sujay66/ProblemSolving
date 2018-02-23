package Medium;

import java.util.Arrays;

public class PerfectSquares {
    public static void main(String[] args){
        int n = 12;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i <= n; i++){
            for(int j = 1; i + j * j <= n; j++){
                dp[i  + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
            }
        }
        System.out.println( dp[n]);
    }
}
