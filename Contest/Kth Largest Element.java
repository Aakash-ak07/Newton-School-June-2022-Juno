// Given two integer array A and B of size N and an integer K. You need to perform N operations, where in the ith operation you append the integer B[i] to array A. Find the kth largest element after each operation.
// Note: The kth largest element is the kth element in the sorted order, not the kth distinct element.
// Input
// First line contains two integers N and K.
// Next line contains N space separated integers denoting elements of array A.
// Next line contains N space separated integers denoting elements of array B.

// Constraints
// 1 <= N <= 10^5
// 1 <= Ai<= 10^5
// 1 <= K <= N
// Output
// Print N space separated integers denoting the kth largest element after each operation.
// Example
// Sample Input 1:
// 4 3
// 4 5 8 2
// 3 5 10 9

// Output
// 4 5 5 8

// Explanation:
// Initially, Array = {4, 5, 8, 2}
// Insert 3. Array = {4, 5, 8, 2, 3} 3rd largest element = 4
// Insert 5. Array = {4, 5, 8, 2, 3, 5} 3rd largest element = 5
// Insert 10. Array = {4, 5, 8, 2, 3, 5, 10} 3rd largest element = 5
// Insert 9. Array = {4, 5, 8, 2, 3, 5, 10, 9} 3rd largest element = 8

// Sample Input 2:
// 3 2
// 4 5 6
// 1 2 3

// Output
// 5 5 5

// Explanation
// Initially, Array = {4, 5, 6}
// Insert 1. Array = {4, 5, 6, 1} 2nd largest element = 5
// Insert 2. Array = {4, 5, 6, 1, 2} 2nd largest element = 5
// Insert 3. Array = {4, 5, 6, 1, 2, 3} 2nd largest element = 5

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < k; i++)
        {
            pq.add(sc.nextInt());
            count++;
        }
        for(int i = 0; i < 2*n-k; i++)
        {
            int value = sc.nextInt();
            count++;
            if(value > pq.peek())
            {
                pq.remove();
                pq.add(value);
            }
            if(count > n)
            {
                System.out.print(pq.peek() + " ");
            }
        }
    }
}
