// You are given an integer array of size N such that 0 <= A[i] <= 9. You need to form two numbers by concatenating these digits. All digits of given array must be used to form the two numbers. Find the minimum possible sum of two numbers that you found.

// Note: Your number can contain leading zeroes but the sum cannot.
// Input
// First line contains an integer N - the size of array
// Next line contains N space separated integers denoting elements of array.

// Constraints
// 1 <= N <= 10^5
// 0 <= Ai<= 9
// Output
// Print the minimum sum that you obtain.
// Example
// Sample Input 1:
// 6
// 6 8 4 5 2 3

// Output
// 604

// Explanation:
// The minimum sum is formed by numbers 358 and 246

// Sample Input 2:
// 5
// 5 3 0 7 4

// Output
// 82

// Explanation
// The minimum sum is formed by numbers 35 and 047.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
     public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int c = 0;
        String ans = "";
        int sum = 0;
        if(n % 2 == 0)
        {
            for(int i = n - 1; i > 0; i = i - 2)
            {
                int n1 = arr[i];
                int n2 = arr[i-1];
                sum = n1 + n2 + c;
                c = sum / 10;
                int r = sum % 10;
                ans = r + ans + "";
            }
        }
        else
        {
            for(int i = n - 1; i > 1; i = i - 2)
            {
                int n1 = arr[i];
                int n2 = arr[i-1];
                sum = n1 + n2 + c;
                c = sum / 10;
                int r = sum % 10;
                ans = r + ans + "";
            }
        }
        if(n % 2 == 0)
        {
            if(c!=0)
                ans=c+ans+"";
        }
        else
        {
            sum = arr[0] + c;
            if(sum != 0)
            ans = sum + ans + "";
        } 
        int j = 0;
        while(ans.charAt(j) == '0')
        {
            j++;
        }
        System.out.println(ans.substring(j));
    }
}
