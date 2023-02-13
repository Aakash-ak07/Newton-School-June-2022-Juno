// Toros went to the supermarket to buy K items. There were a total of N items. Each item had a distinct price Pi. He is cost-effective, so he would buy the K cheapest item. But he knows that the more cheaper an item is, the more is the chances that it can be defective. So he planned to ignore 2 cheapest items and buy K from the remaining ones.
// Find the total cost of all items that he would buy.
// Input
// The first line contains two integers N and K, denoting the total number of items in the supermarket and the number of items Toros is going to buy.
// The second line contains N distinct integers Pi , denoting the prices of the items

// Constraints:
// 1 <= N <= 100000
// 1 <= K <= N - 2
// 1 <= Pi <= 1000000
// Output
// Print a single integer denoting the total cost of items Toros would buy.
// Example

// Sample Input:
// 5 2
// 4 1 2 3 5

// Sample Output:
// 7
// Explanation:
// Toros will ignore items with price 1 and 2 and would buy items with price 4 and 3.

// Sample Input:
// 10 8
// 99 56 50 93 47 36 65 25 87 16

// Sample Output:
// 533

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long p = 0;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i = 2; i < k + 2; i++)
        {
            p += arr[i];
        }
        System.out.println(p);
    }
}
