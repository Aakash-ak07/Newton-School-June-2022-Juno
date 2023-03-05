//  Given an array of length N in which you can swap two elements if their sum is odd i.e for every i (1 to N) and j (1 to N) if (Arr[i] + Arr[j]) is odd then you can swap these elements.
//  What is the lexicographically smallest array you can obtain?

// Input
// First line of input contains a single integer N. Next line contains N space separated integers depicting the elements of the array.

// Constraints:-
// 1 <= N <= 100000
// 1 <= Arr[i] <= 100000
// Output
// Print N space separated elements i. e the array which is the lexicographically smallest possible
// Example
// Sample Input:-
// 3
// 4 1 7

// Sample Output:-
// 1 4 7

// Explanation:-
// Swap 1 and 2 as their sum 4 + 1 = 5 is odd

// Sample Input:-
// 2
// 2 4

// Sample Output:-
// 2 4

// Sample Input:-
// 2
// 5 3

// Sample Output:-
// 5 3


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int odd = 0, even = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 == 1)
                odd++;
            else
                even++;
        }
        if(odd > 0 && even > 0)
            Arrays.sort(arr);
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
