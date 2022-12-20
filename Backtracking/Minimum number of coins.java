// Write a program to find the minimum number of coins/ notes required to make the change of A amount of money.
// For this problem, you can assume that there is an unlimited supply of the various notes/coins available in the Indian currency denominations. The various denominations available are 1, 2, 5, 10, 20, 50, 100, 200, 500 and 2000.
// Input
// The first line of the input contains the number of test cases T.
// Each test case contains a single input A(amount).

// Constraints:
// 1 <= T <= 100000
// 1 <= A <= 10^5
// Output
// For each test case, print the minimum number of changes of amount A.
// Example
// Input:
// 5
// 90
// 110
// 131
// 1111
// 23

// Output:
// 3
// 2
// 4
// 5
// 3

// Explanation:-
// A = 90
// O/P = 3 [50, 20, 20]

// A = 120
// O/P = 2 [100, 20]



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    static int deno[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
    static int n = deno.length;
 
    public static int findMin(int V)
    {
        Vector<Integer> ans = new Vector<>();
        for (int i = n - 1; i >= 0; i--)
        {
            while (V >= deno[i])
            {
                V -= deno[i];
                ans.add(deno[i]);
            }
        }
        return ans.size();
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int A = sc.nextInt();
            System.out.println(findMin(A));
        }
    }
}
