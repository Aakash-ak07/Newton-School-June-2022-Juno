// Jenny was walking along the beach on a Sunday evening. She started from a point 0 and wants to reach a point N. What is the probability that she reaches exactly on point N, if she can only take 2 steps or 3 steps? Probability for step length 2 is P and probability for step length 3 is 1 – P.
// Input
// The first line of the input contains n and p.

// Constraints
// 1<= n <= 1e5
// 0 <= p <= 1
// Output
// Print the final probability upto 2 decimal places.

// Example
// Sample Input
// 5 0.2

// Sample Output
// 0.32

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float p = sc.nextFloat();
        System.out.printf("%.2f", sundayWalk(n, p));
    }

    public static float sundayWalk(int N, float P)
    {
        double dp[] = new double[N + 1];
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = P;
        dp[3] = 1 - P;
     
        for (int i = 4; i <= N; ++i)
          dp[i] = (P) * dp[i - 2] + (1 - P) * dp[i - 3];
     
        return ((float)(dp[N]));
    }
}
