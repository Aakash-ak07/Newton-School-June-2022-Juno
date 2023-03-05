// Given an array Arr of length N. Print the lexographically minimum rotation of the array Arr.
// All the elements of the array are distinct.
// Input
// First line of input contains a single integer N.
// Second line of input contains N integers denoting the array Arr.

// Constraints:
// 1 <= N <= 100000
// 1 <= Arr[i] <= 1000000000
// Output
// Print the lexographically minimum rotation of the array Arr.
// Example
// Sample Input
// 5
// 2 3 1 4 10

// Sample Output
// 1 4 10 2 3

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] < arr[idx])
                idx = i;
        }
        for(int i = idx; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < idx; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
