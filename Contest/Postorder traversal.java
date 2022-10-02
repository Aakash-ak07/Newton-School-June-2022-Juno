// Given a binary tree, with root 1, print the postorder traversal of the tree.
// Algorithm Postorder(tree)
// 1. Traverse the left subtree
// 2. Traverse the right subtree
// 3. Visit the root

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Node 
{
    public int data;
    public Node left;
    public Node right;

    public Node(int data)
    {
      this.data = data; 
    //   this.left = null;
    //   this.right = null; 
    }
}
class Main {
    public static void postOrderTraversal(Node root)
    {
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node arr[] = new Node[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = new Node(i + 1);
        }
        for(int i = 0; i < n; i++)
        {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if(left != -1)
            {
                arr[i].left = arr[left - 1]; 
            }
            if(right != -1)
            {
                arr[i].right = arr[right - 1];
            }
        }
        postOrderTraversal(arr[0]);
    }
}

// Sample Input 1:
// 5
// 2 4
// 5 3
// -1 -1
// -1 -1
// -1 -1
// Sample output 1:
// 5 3 2 4 1

// Explanation: Given binary tree
// 1
// / \
// 2 4
// / \
// 5 3
