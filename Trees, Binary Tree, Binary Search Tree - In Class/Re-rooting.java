// Given a binary tree with root 1. You have to make some other node as the root such that all conditions of a binary tree is satisfied. Print all nodes other than 1 that can be made as the root of the tree in sorted order.
// Note - You cannot add/remove a node. You cannot break any edge.
// Input
// First line contains the integer N, denoting the number of nodes in the binary tree.
// Next N lines contains two integers denoting the left and right child of the i'th node respectively.
// If the node doesn't have a left or right child, it is denoted by '-1'

// 1 <= N <= 100000
// Output
// Print in a single line all nodes other than 1 that can be made as the root. You must print in increasing order.
// Example
// Sample Input 1:
// 5
// 2 4
// 5 -1
// -1 -1
// -1 3
// -1 -1
// Sample output 1:
// 2 3 4 5

// Explanation: Given binary tree
// 1
// / \
// 2 4
// / \
// 5 3
// One possible configuration of tree when 4 is made as the root
// 4
// / \
// 1 3
// /
// 2
// /
// 5


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for(int i = 1; i <= n; i++)
        {
            int left =  sc.nextInt();
            int right =  sc.nextInt();
            if(left != -1)
            {
                arr[i]++;
                arr[left]++;
            }
            if(right != -1)
            {
                arr[i]++;
                arr[right]++;
            }
        }
        for(int i = 2; i <= n; i++)
        {
            if(arr[i] < 3)
            {
                System.out.print(i + " ");
            }
        }
    }
}
