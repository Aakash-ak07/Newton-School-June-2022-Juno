// Given inorder and postorder traversals of a Binary Tree. The task is to construct the binary tree from these traversals. It is given that 1 is the root of the tree.
// Input
// The first line of input contains a single integer N, denoting the number of nodes in the tree. The next line contains N integers denoting the inorder traversal of the tree. The next line contains N integers denoting the postorder traversal of the tree.

// Constraints
// 1 <= N <= 100000
// Output
// Print the preorder traversal of the given tree.
// Example
// Sample Input 1:
// 8
// 4 8 2 5 1 6 3 7
// 8 4 5 2 6 7 3 1

// Sample Output 1:
// 1 2 4 8 5 3 6 7

// Explanation:
// For the given inorder and postorder traversal, the resultant binary tree will be
// 1
// / \
// 2 3
// / \ / \
// 4 5 6 7
// \
// 8

// Sample Input 2:
// 5
// 9 5 2 3 4
// 5 9 3 4 2

// Sample Output 2:
// 2 9 5 4 3

// Explanation:
// For the given inorder and postorder traversal, the resultant binary tree will be
// 2
// / \
// 9 4
// \ /
// 5 3

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Node
{
    int data;
    Node left, right;

    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Main {
    public static Node buildTree(int[] inOrder, int[] postOrder)
    {
        int len = inOrder.length;
        return helper(inOrder, postOrder, 0, len-1, 0, len-1);
    }

    public static Node helper(int[] inOrder, int[] postOrder, int inStart, int inEnd, int pStart, int pEnd)
    {
        if(inStart > inEnd) return null;

        int value = postOrder[pEnd];
        Node root = new Node(value);
        int idx;
        for(idx = inStart; idx <= inEnd; idx++)  // searching root
        {
            if(inOrder[idx] == value)   break;
        }

        int leftSize = idx - inStart;
        int rightSize = inEnd - idx;

        root.left = helper(inOrder, postOrder, inStart, idx - 1, pStart, pStart + leftSize-1);
        root.right = helper(inOrder, postOrder, idx + 1, inEnd, pEnd - rightSize, pEnd - 1);

        return root;
    }
    public static void printPreorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
    public static void main (String[] args) {
                      // Your code here
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] inOrder = new int[n];
        int[] postOrder = new int[n];
        // Node root = null;
        for(int i = 0; i < n; i++)
        {
            inOrder[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            postOrder[i] = sc.nextInt();
        }
        Node root = buildTree(inOrder, postOrder);
        printPreorder(root);
    }
    static class FastReader 
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements()) 
            {
                try 
                {
                st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) 
                {
                e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        }

        long nextLong() 
        {
            return Long.parseLong(next()); 
        }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try 
            {
                if(st.hasMoreTokens())
                {
                str = st.nextToken("\n");
                }
                else
                {
                str = br.readLine();
                }
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
