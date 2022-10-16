// Given an integer array A of size N and an integer K. In one move, you can choose any element from array and add 1 to it. 
// Print the maximum product of the array you can obtain. Print the product modulo 1e9 + 7.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int maxProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums)
            pq.add(n);
        
        while(k-- > 0)
        {
            int top = pq.poll() + 1;
            pq.add(top);
        }
        long ans = 1;
        while(!pq.isEmpty())
        {
            ans = (ans * pq.poll()) % 1000000007;
        }
        return (int)ans;
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProduct(arr, k));
    }
}

Sample Input 1:
3 3
1 2 3

Output
27

// Explanation:
// Add 2 to index 0 and 1 to index 1.
// Array becomes {3, 3, 3}
// Product = 27.

// Sample Input 2:
// 5 1
// 3 6 6 9 1

// Output
// 1944

// Explanation
// Increment the element at index 4.
// Array = {3, 6, 6, 9, 2}
// Product = 1944
