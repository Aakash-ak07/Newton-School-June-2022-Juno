// Reverse Level Order Traversal Using Recursion and Itrative Method

package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int data;
    // int height;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}



public class Traversal {
    public static int getHeight(Node root) {
        if (root == null)
            return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
    // using recursion
    public static void reverseLevelOrder(Node root) {
        if (root == null)
            return;
        int height = getHeight(root);

        for (int i = height; i >= 0; i--) 
        {
            printAtGivenLevel2(root, i + 1);
            System.out.println();
        }
    }

    public static void printAtGivenLevel2(Node root, int level) {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.data + " ");
        }
        printAtGivenLevel2(root.left, level - 1);
        printAtGivenLevel2(root.right, level - 1);
    }

    public static void reverseLevelOrderUsingQueue(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        Stack<Node> st = new Stack<Node>();

        while (q.size() > 0) {
            Node top = q.remove();

            if (top.left != null)
                q.add(top.left);

            if (top.right != null)
                q.add(top.right);

            st.push(top);
        }

        while (st.size() > 0) {
            System.out.print(st.pop().data + " ");
        }
    }

    public static void main(String[] args) {
        Traversal tree = new Traversal(); // if use this remove static function ...

        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(11);

        Traversal.reverseLevelOrder(root);
        Traversal.reverseLevelOrderUsingQueue(root);
    }
}


// Input:
// 2
// / \
// 7 5
// / \ \
// 2 6 9
// / \ /
// 5 11 4

// OutPut:
// Recursion:
//  2 6 9
//  7 5
//  2

// Itrative:
// 4 11 5 9 6 2 5 7 2
