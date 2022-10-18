// The product sum of two equal length arrays num1 and num2 is equal to the sum of a[i] * b[i] for all 0 <= i < a.length (0- indexed).
// For example, if num1 = [1, 2, 3, 4] and num2 = [5, 2, 3, 1], the product sum would be 1*5 + 2*2 + 3*3 + 4*1 = 22.
// Given two arrays num1 and num2 of length n, return the minimum product sum if you are allowed to rearrange the order of the elements in num1.
// Input
// The first line of the input contains the n (size of the array)
// The Second line of the input contains the array num1.
// Next line of the input contains the array num2.

// Constraints
// 1 <= n <= 1e5
// 1 <= num1[i], num2[i] <= 100
// Output
// Print the minimum product sum.
// Example
// Sample Input 1:
// 4
// 5 3 4 2
// 4 2 2 5

// Sample Output 1:
// 40

// Explanation :
// We can rearrange num1 to become [3, 5, 4, 2]. The product sum of [3, 5, 4, 2] and [4, 2, 2, 5] is 3*4 + 5*2 + 4*2 + 2*5 = 40.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main{
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println(minimizeProduct(arr, arr1, n));
    }

    public static int minimizeProduct(int arr[], int arr1[], int n) {
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int result = 0;
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            result += arr[i] * arr1[j];
            i++;
            j--;
        }
        return result;
    }
}









