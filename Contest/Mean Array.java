// Given an array A of size N, find the count of pairs of indices i and j such that 1 <= i < j <= N and the mean of elements at these indices is at least K.
// More formally, you have to find the number of indices i and j such that 1 <= i < j <= N and (Ai + Aj)/2 >= K
// Input
// First line of the input contains two integers N and K.
// The second line contains N space seperated integers Ai

// Constraints:
// 1 <= N <= 105
// 1 <= K <= 109
// 1 <= Ai <= 109
// Output
// Print the number of pairs satisfying the above condition in array A.
// Example
// Sample Input:
// 5 6
// 4 7 8 2 5

// Sample Output:
// 4

// Explaination:
// The following pairs of indices satisfy the condition (1-based indexing)
// (1, 3) -> (4 + 8)/2 = 6
// (2, 3) -> (7 + 8)/2 = 7.5
// (2, 5) -> (7 + 5)/2 = 6
// (3, 5) -> (8 + 5)/2 = 6.5
// There are no more pairs of indices that satisfy the above condition.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static Long meanArray(long arr[], int n, long k)
    {
        long result = 0;
        Arrays.sort(arr);

        int left = 0, right = n - 1;

        while(left < right)
        {
            long mean = (arr[left] + arr[right]) / 2;
            if(mean >= k)
            {
                result += (right - left);
                right--;
            }
            else
                left++;
        }
        return result;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long arr[] = new long[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLong();
        }
        long ans = meanArray(arr, n, k);
        System.out.println(ans);
    }
}
