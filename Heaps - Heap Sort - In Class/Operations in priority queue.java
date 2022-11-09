// Given N integers, your task is to add these elements to the PriorityQueue. Also, given M integers, the task is to check if element is present in PriorityQueue. If present, print 1 and return the max element of priority queue, and then delete the max element. If not present, print -1.
// Input
// First line contains N, number of elements to be inserted into the Priority Queue. Second line contains N positive integers separated by space. Third line contains M, fourth line contains M positive integers.

// Constraints:

// 1 <= M <= N <= 10^3
// 1 <= Arr[i] <= 10^3
// Output
// For each query, print "1" and max element in newlines if element to be found is present in the PriorityQueue, else print "-1". (use new line for each output, as shown in example)
// Example
// Sample Input:
// 1
// 8
// 1 2 3 4 5 2 3 1
// 5
// 1 3 2 9 10

// Sample Output:
// 1
// 5
// 1
// 4
// 1
// 3
// -1
// -1

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
            pq.add(arr[i]);
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) 
        {
            arr[i] = sc.nextInt();
            if (pq.contains(arr[i])) 
            {
                System.out.println("1");
                System.out.println(pq.remove());
            } 
            else
                System.out.println("-1");
        }
    }
}
