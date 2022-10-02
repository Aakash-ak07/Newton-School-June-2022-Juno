// Given a binary tree of N nodes, with root 1, find the number of nodes at depth D of the tree for all D from 1 to N, where depth of root node is taken to be 1.

import java.io.*; 
import java.util.*; 

class Main {
    static class Node {
        int data;
        Node left,right;
        Node (int data) 
        {
            this.data = data;
            left = right = null;
        }
    }
    
    public static void solve(Node[] arr, ArrayList<Integer> ans) {
        Queue<Node> que = new LinkedList<>();
        que.add(arr[0]);
        while ( !que.isEmpty()) 
        {
            int x = que.size();
            ans.add(x);

            for (int i = 0; i < x; i++) 
            {
                Node temp = que.poll();
                if (temp.left != null) 
                {
                    que.add(temp.left);
                }
                if (temp.right != null) 
                {
                    que.add(temp.right);
                }
            }
        }
    }
  
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] arr = new Node[n];
      
        for (int i = 0; i < n; i++) 
        {
            arr[i] = new Node(i +1);
        }
        for (int i = 0; i < n; i++) 
        {
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left != -1) 
            {
                arr[i].left = arr[left -1];
            }

            if (right != -1) 
            {
                arr[i].right = arr[right -1];
            }
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        solve(arr, arr1);
        int s = arr1.size();
        for (int i = 0; i < s; i++) 
        {
            System.out.print(arr1.get(i) + " ");
        }
        for (int i = s; i < n; i++) {
            System.out.print( 0 + " ");
        }
        System.out.println();
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
// 1 2 2 0 0

// Explanation: Given binary tree
// 1
// / \
// 2 4
// / \
// 5 3
