// Given a BST, count the total number of nodes that lie within a given range.
// Input
// The first line contains two space-separated integers low and high.
// Second line contains a single space-separated integer N.
// Next line contains N space-separated integer denoting node value of the tree in inorder-traversal manner.
// Output
// print number of nodes which lies between low to high {both are inclusive}.
// Example
// Sample Input 1:
// 4 9
// 5
// 3 4 8 9 15

// Sample Output 1:
// 3

// Explanation:
// the three number lies in the given range [4, 9]

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Node
{
    int data;
    Node left, right; 

    public Node(int data, Node left, Node right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
class Main {
    static int count = 0;
    public static void nodeCount (Node root, int low, int high)
    {
        if(root == null)  return;

        if(root.data >= low && root.data <= high)
            count++;
        
        nodeCount (root.left, low, high);
        nodeCount (root.right, low, high);
    }

    public static Node buildTree(int arr[], int low, int high)
    {
        if(low > high) return null;

        int mid = (low + high) / 2;
        int val = arr[mid];

        Node left = buildTree(arr, low, mid - 1);
        Node right = buildTree(arr, mid + 1, high);
        Node root = new Node(val, left, right);
        return root;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Node root = buildTree(arr,0, arr.length-1);
        nodeCount(root, l, h);
        System.out.print(count);
    }
}
