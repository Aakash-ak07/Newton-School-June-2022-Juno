// Given an array arr[] of N positive integers and a number K. The task is to find the kth largest element in the array.

// Note: DO NOT USE sort() stl.
// Input
// First line of input contains number of testcases. For each testcase, there will be a single line of input containing number of elements in the array and K. Next line contains N elements.

// Constraints:
// 1 <= T <= 100
// 1 <= N <= 10^4
// 1 <= arr[i] <= 10^5
// 1 <= K <= N
// Output
// For each testcase, print a single line of output containing the kth largest element in the array.
// Example
// Sample Input:
// 2
// 5 3
// 3 5 4 2 9
// 5 5
// 4 3 7 6 5

// Sample Output:
// 4
// 3

// Explanation:
// Testcase 1: Third largest element in the array is 4.
// Testcase 2: Fifth largest element in the array is 3


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        while(t-- > 0)
        {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            int arr[] = new int[n];
            str = br.readLine().split(" ");
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(str[i]);
            }
            PriorityQueue <Integer> pq = new PriorityQueue<>(); 
            for(int i = 0; i < k; i++)
            {
                pq.add(arr[i]);   
            }
            for(int i = k; i < n; i++)
            {
               int element = arr[i];
               if(element > pq.peek())
               {
                   pq.remove();
                   pq.add(element);
               } 
            }
            System.out.println(pq.peek());
        }
    }
}
