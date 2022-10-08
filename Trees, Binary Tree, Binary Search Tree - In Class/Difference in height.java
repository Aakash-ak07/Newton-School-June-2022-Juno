// You have given height N. which is equal to the height of both a binary search tree and a binary tree.
// Print the maximum absolute difference between the number of elements in both tree.
// Input
// first line contain a single integer N (height of tree).

// Constraints:
// 1<=N<=31
// Output
// Print the maximum absolute difference between the number of elements in both tree.
// Example
// Sample Input 1:
// 3
// Sample Output 1:
// 4

// Explanation:
// A
// / \
// B C
// / \ / \
// D E F G


// A
// \
// B
// /
// C
// if we look over both the tree first one is BST with the maximum possible number of elements and the second one can be a binary tree with minimum possible numbers of elements.
// difference between the number of nodes 7-3=4


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = ((int) Math.pow (2, n)-1);  //(2 ^ height - 1)
        System.out.println(max - n);
    }
}
