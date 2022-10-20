// Given two sorted arrays A[] and B[] of sizes N and M respectively, the task is to merge them in a sorted manner and return the priority Queue.

// Note no need to take input for the array you just have to complete the function code and also write it's written type.
// Input
// The first line of the input contains n, m
// The second line contains the input of the first sorted array A.
// The third line contains the input of the second sorted array B.

// Constraints
// 1<= n, m <= 1e5
// 1 <= A[i], B[i] <= 1e5
// Output
// Return the sorted priority queue in ascending order
// Example
// Input :
// 4 3
// 1 2 3 4
// 5 6 7

// Output:
// 1 2 3 4 5 6 7


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void merge(int[] arr, int[] arr2, int n, int m)
    {
        int[] ans = new int[n + m];
        Queue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i < n; i++)
            q.add(arr[i]);
        
        for(int i = 0; i < m; i++)
            q.add(arr2[i]);
        
        int j = 0;
        while(!q.isEmpty())
        {
            ans[j++] = q.peek();
            q.remove();
        }
        for(int k = 0; k < n + m; k++)
            System.out.print(ans[k]+ " ");

    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[m];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();

        merge(arr, arr2, n, m);
    }
}
