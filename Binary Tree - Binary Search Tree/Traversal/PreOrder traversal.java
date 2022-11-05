// Given a binary tree, with root 1, print the preOrder Traversal  of the tree.
// Algorithm Postorder(tree)
// 1. Visit the root
// 2. Traverse the left subtree
// 3. Traverse the right subtree


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
    public static void preOrderTraversal(Node root)
    {
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
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
        preOrderTraversal(arr[0]);
    }
}

// Input: root = [1,null,2,3]
// Output: [1,2,3]

// Explanation: Given binary tree
//     1
//      \
//       2
//      /
//     3
