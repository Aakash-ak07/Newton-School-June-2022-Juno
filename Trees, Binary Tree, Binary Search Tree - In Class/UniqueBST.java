// Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
// Input
// first line contain a single integer N.
// Output
// print number of unique BST.

// Constraints:
// 1<=N<=19
// Example
// Sample Input 1:
// 3

// Sample Output 1:
// 5

// Explanation :
// 1 1 2 3 3
// \ \ / \ / /
// 3 2 1 3 2 1
// / \ / \
// 2 3 1 2

// These are all possible numbers of unique BST which contains a number from 1 to 3.

class Main {
    public static int uniqueTree(int n)
    {
        if(n < 2)
            return 1;
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            ans += uniqueTree(i) * uniqueTree(n - i - 1);
        }
        return ans;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(uniqueTree(n));
    }
}
