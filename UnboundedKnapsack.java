import java.io.*;
import java.util.*;

public class UnboundedKnapsack {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wt[i] = scn.nextInt();
        }

        int cap = scn.nextInt();
        int[] dp = new int[cap + 1];
        dp[0] = 0;
        for (int j = 1; j < dp.length; j++) {
            int max = 0;
            for (int i = 0; i < wt.length; i++) {
                if (j >= wt[i]) {
                    int myVal = dp[j-wt[i]] + val[i];
                    if(max<myVal){
                        max = myVal;
                    }
                }
            }
            dp[j] = max;
        }
        System.out.println(dp[dp.length - 1]);
    }
}
