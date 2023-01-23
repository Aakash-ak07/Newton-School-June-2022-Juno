// You are given weights and values of N items, put some or all of these items in a knapsack of capacity W weight to get the maximum total value in the knapsack. Note that we have at most one quantity of each item.
// In other words, given two integer arrays val[0..(N-1)] and wt[0..(N-1)] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).

// Input
// The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of four lines.
// The first line consists of N the number of items.
// The second line consists of W, the maximum capacity of the knapsack.
// In the next line are N space separated positive integers denoting the values of the N items,
// and in the fourth line are N space separated positive integers denoting the weights of the corresponding items.

// Constraints:
// 1 ≤ T ≤ 100
// 1 ≤ N ≤ 1000
// 1 ≤ W ≤ 1000
// 1 ≤ wt[i] ≤ 1000
// 1 ≤ v[i] ≤ 1000
// Output
// For each testcase, in a new line, print the maximum possible value you can get with the given conditions that you can obtain for each test case in a new line.
// Example
// Input:
// 2
// 3
// 4
// 1 2 3
// 4 5 1
// 3
// 3
// 1 2 3
// 4 5 6

// Output:
// 3
// 0


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t--> 0)
        {
            int n = Integer.parseInt(br.readLine());
            int w = Integer.parseInt(br.readLine());
            String s1[] = br.readLine().split(" ");
            int val[] = new int[n];
            for(int i=0; i<n; i++)
                val[i] = Integer.parseInt(s1[i]);
            
            String s2[] = br.readLine().split(" ");
            int wt[] = new int[n];
            for(int i=0; i<n; i++)
                wt[i] = Integer.parseInt(s2[i]);

            System.out.println(knapSack(w, wt, val, n));
        }
    }

    public static int knapSack(int W, int wt[], int val[], int n) { 
        int i, w;
        int [][]K = new int[2][W + 1];
        for (i = 0; i <= n; i++) 
        {
            for (w = 0; w <= W; w++) 
            {
                if (i == 0 || w == 0)
                    K[i % 2][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i % 2][w] = Math.max( val[i - 1] + K[(i - 1) % 2][w - wt[i - 1]], K[(i - 1) % 2][w]);
                else
                    K[i % 2][w] = K[(i - 1) % 2][w];
            }
        }
        return K[n % 2][W];
    } 
}
