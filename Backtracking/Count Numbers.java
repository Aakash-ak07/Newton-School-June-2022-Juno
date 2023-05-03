// Given an integer N, print the count of all numbers with unique digits, x, where 0 <= x < 10^N.
// Input
// First line contains a single integer N.

// Constraints:
// 0 <= N <= 8
// Output
// Print the count of all numbers with unique digits, x

// Example
// Sample Input 1:
// 2
// Sample Output 1:
// 91

// Explanations:
// The answer should be the total numbers in the range of 0 ≤ x < 100, excluding 11, 22, 33, 44, 55, 66, 77, 88, 99.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countNumbers(n));
    }

    public static int countNumbers(int n){
        if(n == 0)
            return 1;
        int res = 10;
        int unDigits = 9;
        int avl = 9;
        while(n-- > 1 && avl > 0)
        {
            unDigits *= avl;
            res += unDigits;
            avl--;
        }
        return res;
    }
}
